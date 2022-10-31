from flask import Flask, jsonify

app = Flask(__name__)

task = [{'slackUsername': 'mukheee', 'backend': True, 'age': 25, 'bio': 'I am a very inquisitive person with a hunger to know more'}]

@app.route('/')
def index():
    return "Welcome to the course api"

@app.route("/task", methods=['GET'])
def get():
    return jsonify({'Task': task})


if __name__ == "__main__":
    app.run(debug=True)
