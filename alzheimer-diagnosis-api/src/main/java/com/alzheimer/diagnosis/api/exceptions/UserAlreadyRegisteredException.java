package com.alzheimer.diagnosis.api.exceptions;

public class UserAlreadyRegisteredException extends RuntimeException{

    public UserAlreadyRegisteredException(String msg){
        super(msg);
    }
}