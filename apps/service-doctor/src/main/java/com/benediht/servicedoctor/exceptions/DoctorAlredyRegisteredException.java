package com.benediht.servicedoctor.exceptions;

public class DoctorAlredyRegisteredException extends RuntimeException{

    public DoctorAlredyRegisteredException(String msg){
        super(msg);
    }
}
