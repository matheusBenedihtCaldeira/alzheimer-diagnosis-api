package com.api.prediction.services.exceptions;

public class UserAlredyExistsException extends RuntimeException{
    public UserAlredyExistsException(String msg){
        super(msg);
    }
}