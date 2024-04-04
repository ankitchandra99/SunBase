package com.example.SunBaseAssignment.Exceptions;

public class CustomerAlreadyExits extends RuntimeException {

    public CustomerAlreadyExits(String message){
        super(message);
    }
}
