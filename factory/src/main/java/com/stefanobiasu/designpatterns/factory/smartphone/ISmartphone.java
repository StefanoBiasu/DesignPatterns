package com.stefanobiasu.designpatterns.factory.smartphone;

/**
 * Definition of an ISmartPhone
 */
public interface ISmartphone {

    /**
     * Rings.
     */
    void ring();

    /**
     * Makes a photo.
     */
    void makePhoto();

    /**
     * Sends a text message.
     *
     * @param message the text message;
     */
    void sendMessage(String message);

}
