package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory;

import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;

/**
 * Definition of a {@link ISmartphone} factory.
 */
public interface ISmartphoneFactory {

    //Currently available sizes.
    String _4_4_INCHES = "4_4";
    String _6_7_INCHES = "6_7";

    //Currently available brands.
    String APPLE_COMPONENTS = "APPLE_COMPONENTS";
    String SAMSUNG_COMPONENTS = "SAMSUNG_COMPONENTS";

    /**
     * Factory method that creates a smartphone.
     *
     * @param size the size of the phone.
     * @return the phone.
     */
    ISmartphone createSmartphone(String size);
}