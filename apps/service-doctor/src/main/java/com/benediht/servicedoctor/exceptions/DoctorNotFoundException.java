package com.benediht.servicedoctor.exceptions;

public class DoctorNotFoundException extends RuntimeException{

    public DoctorNotFoundException(String msg){
        super(msg);
    }
}