from flask import Flask, request, jsonify, render_template_string, render_template
import sqlite3
import os

# Database setup
def init_db(level):
    db_path = f'db_level_{level}.sqlite'
    # remove db_path
    if os.path.exists(db_path):
        os.remove(db_path)
    with sqlite3.connect(db_path) as conn:
        cursor = conn.cursor()
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY,
                username TEXT NOT NULL,
                password TEXT NOT NULL
            )
        ''')
        cursor.execute("INSERT OR IGNORE INTO users (username, password) VALUES ('admin', 'password')")
        cursor.execute('''
            CREATE TABLE IF NOT EXISTS secrets (
                id INTEGER PRIMARY KEY,
                secret_key TEXT NOT NULL,
                secret_value TEXT NOT NULL
            )
        ''')
        cursor.execute("INSERT OR IGNORE INTO secrets (secret_key, secret_value) VALUES ('api_key', '12345')")
        conn.commit()

# Create Flask app with explicit template and static folders
app = Flask(__name__,
            template_folder='templates',
            static_folder='static')

# Exercise 1 - Auth bypass (1 == 1) via SQLi
@app.route('/login', methods=['POST'])
def login():
    level = request.form.get('level', 1)
    db_path = f'db_level_{level}.sqlite'
    
    username = request.form.get('username')
    password = request.form.get('password')

    query = f"SELECT * FROM users WHERE username='{username}' AND password='{password}'"
    
    with sqlite3.connect(db_path) as conn:
        cursor = conn.cursor()
        cursor.execute(query)
        user = cursor.fetchone()

    if user:
        return jsonify({"message": "Login successful!"})
    else:
        return jsonify({"message": "Invalid credentials!"}), 401

@app.route('/read_data', methods=['POST'])
def read_data():
    level = request.form.get('level', 2)
    db_path = f'db_level_{level}.sqlite'
    
    table = request.form.get('table')

    query = f"SELECT * FROM {table}"

    try:
        with sqlite3.connect(db_path) as conn:
            cursor = conn.cursor()
            cursor.execute(query)
            rows = cursor.fetchall()
        
        return jsonify({"data": rows})
    except sqlite3.Error as e:
        return jsonify({"error": str(e)})

@app.route('/blind', methods=['POST'])
def users_query():
    level = request.form.get('level', 3)
    db_path = f'db_level_{level}.sqlite'
    
    condition = request.form.get('condition')
    
    query = f"SELECT * FROM users WHERE id=1 AND {condition}"

    try:
        with sqlite3.connect(db_path) as conn:
            cursor = conn.cursor()
            cursor.execute(query)
            result = cursor.fetchone()
        
        return jsonify({"result": "success"})
    except sqlite3.Error as e:
        return jsonify({"error": "BOOM"})

@app.route('/level1', methods=['GET', 'POST'])
def level1():
    init_db(1)
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        # Call the login endpoint
        response = login()
        return response
    return render_template('level1.html')

# Level 2 - Form for Union-based SQLi
@app.route('/level2', methods=['GET', 'POST'])
def level2():
    init_db(2)
    if request.method == 'POST':
        table = request.form['table']
        # Call the read_data endpoint
        response = read_data()
        return response
    return render_template('level2.html')

@app.route('/level3', methods=['GET', 'POST'])
def level3():
    init_db(3)
    if request.method == 'POST':
        condition = request.form['condition']
        response = users_query()
        return response
    return render_template('level3.html')

@app.route('/')
def index():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)
