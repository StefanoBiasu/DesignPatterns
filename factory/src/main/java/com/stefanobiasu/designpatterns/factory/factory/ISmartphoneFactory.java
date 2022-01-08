package com.stefanobiasu.designpatterns.factory.factory;

import com.stefanobiasu.designpatterns.factory.smartphone.ISmartphone;

/**
 * Definition of a {@link ISmartphone} factory.
 */
public interface ISmartphoneFactory {

    //Currently available sizes.
    String _4_4_INCHES = "4_4";
    String _6_7_INCHES = "6_7";

    /**
     * Factory method that creates a smartphone.
     *
     * @param size the size of the phone.
     * @return the phone.
     */
    ISmartphone createSmartphone(String size);

}
