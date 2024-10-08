package com.scmFinal.helpers;

public class ResourceNotFoundException extends RuntimeException {

    // parameterized constructors
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException() {
        super("Resource not found");
    }

}