<?php
// Simple GUI to switch between levels

if (isset($_GET['level'])) {
    $level = (int)$_GET['level'];
} else {
    $level = 1; // Default to level 1
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercise 3 - Web Knitting</title>
    <style>
        :root {
            --primary: #9b30ff;
            --secondary: #4a0080;
            --background: #1a1a1a;
            --text: #e0e0e0;
            --accent: #ff00ff;
        }
        
        body {
            background-color: var(--background);
            color: var(--text);
            font-family: 'Courier New', monospace;
            margin: 0;
            padding: 20px;
            line-height: 1.6;
        }

        h1, h2 {
            color: var(--primary);
            text-shadow: 0 0 10px var(--accent);
            text-align: center;
            margin-bottom: 30px;
        }

        nav {
            background-color: var(--secondary);
            padding: 15px;
            border-radius: 8px;
            margin-bottom: 30px;
            box-shadow: 0 0 15px var(--primary);
        }

        nav ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: center;
            gap: 20px;
        }

        nav a {
            color: var(--text);
            text-decoration: none;
            padding: 8px 16px;
            border: 1px solid var(--primary);
            border-radius: 4px;
            transition: all 0.3s ease;
        }

        nav a:hover {
            background-color: var(--primary);
            box-shadow: 0 0 10px var(--accent);
        }

        form {
            background-color: var(--secondary);
            padding: 20px;
            border-radius: 8px;
            max-width: 600px;
            margin: 0 auto;
            box-shadow: 0 0 15px rgba(155, 48, 255, 0.3);
        }

        input[type="text"], textarea {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            background-color: var(--background);
            border: 1px solid var(--primary);
            color: var(--text);
            border-radius: 4px;
        }

        textarea {
            min-height: 100px;
            resize: vertical;
        }

        button {
            background-color: var(--primary);
            color: var(--text);
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            transition: all 0.3s ease;
        }

        button:hover {
            background-color: var(--accent);
            box-shadow: 0 0 10px var(--primary);
        }

        pre {
            background-color: var(--secondary);
            padding: 15px;
            border-radius: 8px;
            overflow-x: auto;
            border: 1px solid var(--primary);
            margin: 20px 0;
        }

        hr {
            border: none;
            border-top: 2px solid var(--primary);
            margin: 30px 0;
            box-shadow: 0 0 10px var(--accent);
        }

        img {
            display: block;
            margin: 20px auto;
            border: 2px solid var(--primary);
            border-radius: 8px;
            box-shadow: 0 0 15px var(--accent);
        }

        label {
            color: var(--primary);
            display: block;
            margin-bottom: 5px;
        }

        p {
            text-align: center;
            color: var(--accent);
        }
    </style>
</head>
<body>
    <h1>Welcome to Web Knitting 101 - Choose Your Level</h1>
    <nav>
        <ul>
            <li><a href="?level=1">Level 1 - Can you read?</a></li>
            <li><a href="?level=2">Level 2 - Can you Write?</a></li>
            <li><a href="?level=3">Level 3 - Can you knit?</a></li>
        </ul>
    </nav>

    <hr>

    <?php
    if ($level === 1) {
        echo "<h2>Level 1 - Can you read?</h2>";
        echo "<form method='GET' action='index.php'>
                <label for='file'>Enter filename:</label>
                <input type='text' name='file' id='file'>
                <button type='submit'>Read File</button>
              </form>";

        if (isset($_GET['file'])) {
            $file = $_GET['file'];
            $safe_file = str_replace('../', '', $file); // Prevent directory traversal
            if (file_exists("./" . $safe_file)) { // Ensure it's relative
                echo "<pre>" . file_get_contents("./" . $safe_file) . "</pre>";
            } else {
                echo "<p>File not found!</p>";
            }
        }
    }

    if ($level === 2) {
        echo "<h2>Level 2 - Can you Write?</h2>";
        echo "<form method='POST' action='index.php?level=2'>
                <label for='file_content'>File Content:</label>
                <textarea name='file_content' id='file_content'></textarea><br>
                <label for='secret'>Secret:</label>
                <input type='text' name='secret' id='secret'><br>
                <label for=file_name>File Name:</label>
                <input type='text' name='file_name' id='file_name'><br>
                <button type='submit'>Submit</button>
              </form>";

        if (isset($_POST['file_content']) && isset($_POST['secret']) && isset($_POST['file_name'])) {
            $secret = $_POST['secret'];
            $file_name = $_POST['file_name'];
            if (md5($secret) === '5f4dcc3b5aa765d61d8327deb882cf99') { // MD5 of "password"
                file_put_contents("/tmp/" . $file_name . ".txt", $_POST['file_content']);
                echo "<p>File written successfully!</p>";
            } else {
                echo "<p>Invalid MD5 hash!</p>";
            }
        }
    }

    if ($level === 3) {
        echo "<h2>Level 3 - Can you knit?</h2>";
        if (isset($_POST['file'])) {
            $file = basename($_POST['file']);  // basename avoids directory traversal
            $allowed_extensions = ['png', 'jpg', 'jpeg', 'svg', 'txt'];
            $file_extension = strtolower(pathinfo($file, PATHINFO_EXTENSION));
            if (in_array($file_extension, $allowed_extensions)) {
                $file_path = "./documents/" . $file;
                if (file_exists($file_path)) {
                    if ($file_extension === 'txt') {
                        var_dump($file_path);
                        echo "<pre>";
                        include($file_path);
                        echo "</pre>";
                        die();
                    } else {
                        echo "<img src='$file_path' alt='$file' style='max-width: 100%; height: auto;'>";
                    }
                } else {
                    echo "<p>File not found!</p>";
                }
            } else {
                echo "<p>Invalid file type!</p>";
            }
        } else {
            echo "<form method='POST' action='index.php?level=3'>
                    <label for='file'>File to view:</label>
                    <input type='text' name='file' id='file'>
                    <button type='submit'>View Document</button>
                  </form>";
        }
    }
    ?>
</body>
</html>
