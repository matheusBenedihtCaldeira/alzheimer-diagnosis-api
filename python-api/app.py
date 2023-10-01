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

    # Coletar os dados de entrada diretamente
    M_F = data['M/F']
    Age = data['Age']
    EDUC = data['EDUC']
    SES = data['SES']
    MMSE = data['MMSE']
    CDR = data['CDR']
    eTIV = data['eTIV']
    nWBV = data['nWBV']
    ASF = data['ASF']

    # Criar um array NumPy a partir dos valores
    input_data = np.array([M_F, Age, EDUC, SES, MMSE, CDR, eTIV, nWBV, ASF]).reshape(1, -1)

    print(input_data)

    # Fazer a previsão
    predict = model.predict(input_data)

    return jsonify({'result: ': predict.tolist()})

if __name__ == '__main__':
    app.run()
