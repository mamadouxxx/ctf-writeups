from flask import Flask, request, render_template, make_response, redirect, url_for, Response
import pdfkit

app = Flask(__name__, template_folder='templates')

# Level 1: Reflected XSS
@app.route('/level1', methods=['GET'])
def level1():
    user_input = request.args.get('input', '')
    response = make_response(render_template('level1.html', user_input=user_input))
    return response

# Level 2: Stored XSS
stored_comments = []

@app.route('/level2', methods=['GET', 'POST'])
def level2():
    if request.method == 'POST':
        comment = request.form.get('comment').replace("<", "&lt;").replace(">", "&gt;")
        stored_comments.append(comment)
        response = make_response(redirect(url_for('level2')))
        return response
    return render_template('level2.html', comments=stored_comments)

# Level 3: DOM-based XSS
@app.route('/level3')
def level3():
    return render_template('level3.html')

# Level 4: Server-Side XSS
@app.route('/level4', methods=['GET'])
def level4():
    # Reaching this page from external IP should never be possible
    if request.remote_addr == '127.0.0.1':
        from os import environ
        debug_env = "### ENV ###" + "<br>"
        for name, value in environ.items():
            debug_env += "{0}: {1}".format(name, value) + "<br>"
        return debug_env
    title = request.args.get('title', 'Default Title')
    
    # Generate HTML content for the PDF
    html_content = f"""
    <html>
    <head>
        <style>
            body {{
                font-family: Arial, sans-serif;
            }}
            .title {{
                font-weight: bold;
                font-size: 24px;
            }}
        </style>
    </head>
    <body>
        <div class="title">{title}</div>
        <div>{'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lacinia odio vitae vestibulum.' * 5}</div>
    </body>
    </html>
    """
    
    # Generate PDF from the HTML content
    pdf = pdfkit.from_string(html_content, False)

    # Return PDF as a response
    response = Response(pdf, content_type='application/pdf')
    response.headers['Content-Disposition'] = 'inline; filename="generated.pdf"'
    return response

@app.route('/')
def index():
    levels = [
        {'name': 'Level 1: Reflected XSS', 'url': url_for('level1')},
        {'name': 'Level 2: Stored XSS', 'url': url_for('level2')},
        {'name': 'Level 3: DOM-based XSS', 'url': url_for('level3')},
        {'name': 'Level 4: Server-Side XSS', 'url': url_for('level4')}
    ]
    return render_template('index.html', levels=levels)

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)