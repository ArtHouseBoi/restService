package com.example.demo;

public class OrderNotFoundException extends RuntimeException{

    OrderNotFoundException(Long id) {
        super ("could not find Order " + id);
    }
}
