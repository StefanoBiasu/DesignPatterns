package com.stefanobiasu.designpatterns.factory.factory;

import com.stefanobiasu.designpatterns.factory.smartphone.Apple_4_4_Smartphone;
import com.stefanobiasu.designpatterns.factory.smartphone.Apple_6_7_Smartphone;
import com.stefanobiasu.designpatterns.factory.smartphone.ISmartphone;

/**
 * Implementation of {@link ISmartphoneFactory}.
 */
public class AppleSmartphoneFactory implements ISmartphoneFactory {

    @Override
    public ISmartphone createSmartphone(String size) {
        if (size.equals(ISmartphoneFactory._4_4_INCHES)) {
            return new Apple_4_4_Smartphone();
        } else if (size.equals(ISmartphoneFactory._6_7_INCHES)) {
            return new Apple_6_7_Smartphone();
        } else {
            throw new RuntimeException("not a valid size");
        }
    }
}
