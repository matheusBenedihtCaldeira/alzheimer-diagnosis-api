package com.alzheimer.diagnosis.api.exceptions;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(String msg){
        super(msg);
    }
}