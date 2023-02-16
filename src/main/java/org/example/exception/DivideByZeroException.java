package org.example.exception;

public class DivideByZeroException extends CalculatorException {
    public DivideByZeroException(String string){
        super(string);
    }
}
