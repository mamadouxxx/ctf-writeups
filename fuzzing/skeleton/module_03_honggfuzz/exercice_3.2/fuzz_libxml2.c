/*
 * Exercice 3.2 : Fuzzing de libxml2 avec honggfuzz
 *
 * Ce harness fuzz la bibliothèque libxml2, une bibliothèque C très utilisée
 * pour parser du XML. libxml2 a eu de nombreuses CVEs découvertes par fuzzing.
 *
 * Le harness teste plusieurs fonctionnalités de libxml2 :
 * - Parsing de documents XML
 * - Validation DTD
 * - XPath queries
 * - Namespace handling
 *
 * Compilation :
 *   XXX
 *
 * Utilisation avec honggfuzz :
 *   honggfuzz -i seeds/ -n 4 -- ./fuzz_libxml2
 *   honggfuzz -i seeds/ -P -n 8 -- ./fuzz_libxml2  (mode persistent)
 *
 * Installation de libxml2 :
 *   Ubuntu/Debian : sudo apt-get install libxml2-dev
 *   macOS :         brew install libxml2
 */

#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#include <libxml/HTMLparser.h>
#include <libxml/parser.h>
#include <libxml/tree.h>
#include <libxml/xmlschemas.h>
#include <libxml/xpath.h>
#include <libxml/xpathInternals.h>

// Désactiver les messages d'erreur de libxml2 pour le fuzzing
static void suppress_error_output(void *ctx, const char *msg, ...) {
  (void)ctx;
  (void)msg;
  // Ne rien faire - supprime les messages d'erreur
}

// Initialisation de libxml2 pour le fuzzing
static void init_libxml2() {
  // Initialiser le parser
  xmlInitParser();

  // Désactiver les erreurs et warnings pour éviter de polluer stdout
  xmlSetGenericErrorFunc(NULL, suppress_error_output);
  xmlSetStructuredErrorFunc(NULL, NULL);

  // Options de sécurité pour éviter les timeouts
  xmlSetExternalEntityLoader(NULL);
}

// Nettoyage de libxml2
static void cleanup_libxml2() { xmlCleanupParser(); }

// Test 1 : Parser un document XML basique
static void test_parse_doc(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET | XML_PARSE_NOENT);
  if (doc != NULL) {
    // Récupérer le root element
    xmlNode *root = xmlDocGetRootElement(doc);
    if (root != NULL) {
      // Parcourir les enfants
      for (xmlNode *node = root->children; node; node = node->next) {
        if (node->type == XML_ELEMENT_NODE) {
          // Accéder au nom et contenu
          const char *name = (const char *)node->name;
          xmlChar *content = xmlNodeGetContent(node);
          if (content != NULL) {
            xmlFree(content);
          }
          (void)name; // Éviter warning unused
        }
      }
    }
    xmlFreeDoc(doc);
  }
}

// Test 2 : Parser avec validation DTD
static void test_parse_with_dtd(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET | XML_PARSE_DTDVALID);
  if (doc != NULL) {
    // Valider le document
    xmlValidCtxtPtr ctxt = xmlNewValidCtxt();
    if (ctxt != NULL) {
      xmlValidateDocument(ctxt, doc);
      xmlFreeValidCtxt(ctxt);
    }
    xmlFreeDoc(doc);
  }
}

// Test 3 : XPath queries
static void test_xpath(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET);
  if (doc != NULL) {
    xmlXPathContextPtr xpathCtx = xmlXPathNewContext(doc);
    if (xpathCtx != NULL) {
      // Tester plusieurs XPath queries
      const char *queries[] = {"//node", "//*", "//node[@attr]", "//node/child",
                               NULL};

      for (int i = 0; queries[i] != NULL; i++) {
        xmlXPathObjectPtr xpathObj =
            xmlXPathEvalExpression((const xmlChar *)queries[i], xpathCtx);
        if (xpathObj != NULL) {
          xmlXPathFreeObject(xpathObj);
        }
      }

      xmlXPathFreeContext(xpathCtx);
    }
    xmlFreeDoc(doc);
  }
}

// Test 4 : Parser HTML (plus permissif)
static void test_parse_html(const uint8_t *data, size_t size) {
  htmlDocPtr doc = htmlReadMemory(
      (const char *)data, (int)size, "noname.html", NULL,
      HTML_PARSE_NOERROR | HTML_PARSE_NOWARNING | HTML_PARSE_NONET);
  if (doc != NULL) {
    xmlNode *root = xmlDocGetRootElement(doc);
    if (root != NULL) {
      // Parcourir le DOM HTML
      for (xmlNode *node = root; node; node = node->next) {
        if (node->type == XML_ELEMENT_NODE) {
          xmlChar *content = xmlNodeGetContent(node);
          if (content != NULL) {
            xmlFree(content);
          }
        }
      }
    }
    xmlFreeDoc(doc);
  }
}

// Test 5 : Manipulations sur le document
static void test_manipulate_doc(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET);
  if (doc != NULL) {
    xmlNode *root = xmlDocGetRootElement(doc);
    if (root != NULL) {
      // Créer un nouveau noeud
      xmlNode *new_node = xmlNewNode(NULL, (const xmlChar *)"new_element");
      if (new_node != NULL) {
        // Ajouter du contenu
        xmlNodeSetContent(new_node, (const xmlChar *)"content");

        // Ajouter un attribut
        xmlNewProp(new_node, (const xmlChar *)"attr", (const xmlChar *)"value");

        // Ajouter le noeud au document
        xmlAddChild(root, new_node);
      }

      // Copier des noeuds
      if (root->children != NULL) {
        xmlNode *copy = xmlCopyNode(root->children, 1);
        if (copy != NULL) {
          xmlAddChild(root, copy);
        }
      }
    }
    xmlFreeDoc(doc);
  }
}

// Test 6 : Serialization
static void test_serialization(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET);
  if (doc != NULL) {
    // Sérialiser le document en mémoire
    xmlChar *mem = NULL;
    int mem_size = 0;
    xmlDocDumpMemory(doc, &mem, &mem_size);
    if (mem != NULL) {
      // Re-parser le document sérialisé
      xmlDocPtr doc2 = xmlReadMemory((const char *)mem, mem_size, "noname2.xml",
                                     NULL, XML_PARSE_NONET);
      if (doc2 != NULL) {
        xmlFreeDoc(doc2);
      }
      xmlFree(mem);
    }
    xmlFreeDoc(doc);
  }
}

// Test 7 : Namespace handling
static void test_namespaces(const uint8_t *data, size_t size) {
  xmlDocPtr doc = xmlReadMemory((const char *)data, (int)size, "noname.xml",
                                NULL, XML_PARSE_NONET);
  if (doc != NULL) {
    xmlNode *root = xmlDocGetRootElement(doc);
    if (root != NULL) {
      // Chercher les namespaces
      for (xmlNode *node = root; node; node = node->next) {
        if (node->type == XML_ELEMENT_NODE) {
          xmlNs *ns = node->ns;
          if (ns != NULL) {
            const char *href = (const char *)ns->href;
            const char *prefix = (const char *)ns->prefix;
            (void)href;
            (void)prefix;
          }

          // Chercher les définitions de namespace
          for (xmlNs *ns_def = node->nsDef; ns_def; ns_def = ns_def->next) {
            const char *href = (const char *)ns_def->href;
            const char *prefix = (const char *)ns_def->prefix;
            (void)href;
            (void)prefix;
          }
        }
      }
    }
    xmlFreeDoc(doc);
  }
}

// Fonction principale de fuzzing
static void fuzz_target(const uint8_t *data, size_t size) {
  // Ignorer les inputs trop petits ou trop grands
  if (size < 10 || size > 100000) {
    return;
  }

  // Tester différentes fonctionnalités selon le premier byte
  // Cela aide le fuzzer à explorer différents chemins
  uint8_t selector = data[0] % 7;
  data++;
  size--;

  switch (selector) {
  case 0:
    test_parse_doc(data, size);
    break;
  case 1:
    test_parse_with_dtd(data, size);
    break;
  case 2:
    test_xpath(data, size);
    break;
  case 3:
    test_parse_html(data, size);
    break;
  case 4:
    test_manipulate_doc(data, size);
    break;
  case 5:
    test_serialization(data, size);
    break;
  case 6:
    test_namespaces(data, size);
    break;
  }
}

// Mode standard : lire depuis stdin
int main(void) {
  // Initialiser libxml2
  init_libxml2();

  // Lire l'input depuis stdin
  uint8_t buffer[100000];
  ssize_t size = read(STDIN_FILENO, buffer, sizeof(buffer));

  if (size > 0) {
    fuzz_target(buffer, size);
  }

  // Nettoyage
  cleanup_libxml2();

  return 0;
}

/*
 * Note pour le mode persistent :
 *
 * Pour utiliser le mode persistent de honggfuzz (bien plus rapide),
 * décommentez le code ci-dessous et recompilez :
 *
 * #ifdef HFUZZ_CC_ASAN
 * #include <libhfuzz/libhfuzz.h>
 *
 * int main(void) {
 *     init_libxml2();
 *
 *     HF_ITER(&buffer, &size) {
 *         fuzz_target(buffer, size);
 *     }
 *
 *     cleanup_libxml2();
 *     return 0;
 * }
 * #endif
 *
 * Puis compiler avec : hfuzz-clang -DHFUZZ_CC_ASAN ...
 * Et lancer avec : honggfuzz -i seeds/ -P -n 8 -- ./fuzz_libxml2
 */
