package com.alzheimer.diagnosis.api.exceptions;

public class EmailAlreadyInUseException extends RuntimeException{
    public EmailAlreadyInUseException(String msg){
        super(msg);
    }
}