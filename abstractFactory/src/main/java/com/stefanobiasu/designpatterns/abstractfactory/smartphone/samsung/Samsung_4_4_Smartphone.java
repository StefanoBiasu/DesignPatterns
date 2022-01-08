package com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung;

import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;

/**
 * Samsung implementation of a 4.4 inch phone.
 */
public class Samsung_4_4_Smartphone implements ISmartphone {

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
        // whatsapp
    }
}
