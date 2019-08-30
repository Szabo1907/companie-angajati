package com.sda.paycheck.calculator.denisa;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }

    public InvalidDataException() {

    }
}
