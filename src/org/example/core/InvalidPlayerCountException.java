package org.example.core;

public class InvalidPlayerCountException extends Exception{
    InvalidPlayerCountException(String message){
        super(message);
    }
}
