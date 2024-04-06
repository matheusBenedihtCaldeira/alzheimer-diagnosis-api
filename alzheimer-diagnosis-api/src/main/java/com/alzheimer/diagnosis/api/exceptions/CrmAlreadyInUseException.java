package com.alzheimer.diagnosis.api.exceptions;

public class CrmAlreadyInUseException extends RuntimeException{

    public CrmAlreadyInUseException(String msg){
        super(msg);
    }
}