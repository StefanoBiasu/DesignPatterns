package com.stefanobiasu.designpatterns.factory.smartphone;

/**
 * Implementation of an Apple 6.7 inch phone.
 */
public class Apple_6_7_Smartphone implements ISmartphone {
    @Override
    public void ring() {
        // ring!
    }

    @Override
    public void makePhoto() {
        // click!
    }

    @Override
    public void sendMessage(String message) {
        // whatsapp!
    }
}
