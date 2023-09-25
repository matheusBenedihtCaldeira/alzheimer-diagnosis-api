from flask import Flask, request, jsonify
import joblib
import numpy as np

model = joblib.load('model/NaiveBayesAlzheimerPrediction.pkl')
app = Flask(__name__)

@app.route('/', methods=['GET'])
def index():
    return 'Model API!'

@app.route('/predict', methods=['POST'])
def predict_route():
    data = request.get_json(force=True)

    predict_data = [data['M/F'], data['Age'], data['EDUC'], data['SES'], data['MMSE'],
                     data['CDR'], data['eTIV'], data['nWBV'], data['ASF']]

    input = np.array(predict_data).reshape(1, -1)

    predict = model.predict(input)

    return jsonify({'result: ': predict.tolist()})
if __name__ == '__main__':
    app.run()