package com.api.prediction.models.dto;

public record PredictionRequest(Double sex, Double age_n, Double educ_n, Double ses_n, Double mmse_n, Double cdr_n, Double etiv_n, Double nwbv_n, Double asf_n) {
}