package com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung;

import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;

/**
 * Implementation of a Samsung 6.7 inch phone.
 */
public class Samsung_6_7_Smartphone implements ISmartphone {

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
