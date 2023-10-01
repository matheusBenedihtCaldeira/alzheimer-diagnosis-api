from flask import Flask, request, jsonify
import joblib
import numpy as np
import pandas as pd
from sklearn.preprocessing import StandardScaler

standardScaler = joblib.load('model/StandardScaler.pkl')
model = joblib.load('model/NaiveBayesModel.pkl')
app = Flask(__name__)

@app.route('/', methods=['GET'])
def index():
    return 'Model API!'

@app.route('/predict', methods=['POST'])
def predict_route():
    data = request.get_json(force=True)
    data_values = np.array(list(data.values()))
    data_values = data_values.reshape(1, -1)
    standardizedData = standardScaler.transform(data_values[:,1:])
    data_values[0,1:] = standardizedData

    predict = model.predict(data_values)

    return jsonify({'result: ': predict.tolist()})

if __name__ == '__main__':
    app.run()
