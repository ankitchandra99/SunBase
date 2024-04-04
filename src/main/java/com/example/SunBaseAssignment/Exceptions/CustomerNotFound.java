package com.example.SunBaseAssignment.Exceptions;

public class CustomerNotFound  extends  RuntimeException{

   public  CustomerNotFound(String message){
       super(message);
   }
}
