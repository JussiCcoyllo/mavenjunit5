package org.example.exception;

public class NotANumberException extends CalculatorException{
    public NotANumberException(String string){
        super(string);
    }
}
