package com.stefanobiasu.designpatterns.factory;

import com.stefanobiasu.designpatterns.factory.factory.AppleSmartphoneFactory;
import com.stefanobiasu.designpatterns.factory.factory.ISmartphoneFactory;
import com.stefanobiasu.designpatterns.factory.smartphone.Apple_4_4_Smartphone;
import com.stefanobiasu.designpatterns.factory.smartphone.Apple_6_7_Smartphone;
import com.stefanobiasu.designpatterns.factory.smartphone.ISmartphone;

import static com.stefanobiasu.designpatterns.factory.factory.ISmartphoneFactory._4_4_INCHES;
import static com.stefanobiasu.designpatterns.factory.factory.ISmartphoneFactory._6_7_INCHES;

public class Main {

    public static void main(String[] args) {

        ISmartphoneFactory factory = new AppleSmartphoneFactory();

        final ISmartphone apple_4_4_smartphone = factory.createSmartphone(_4_4_INCHES);
        System.out.println("Apple ISmartPhone implementation of 4.4 inches smartphone:" + apple_4_4_smartphone.getClass());
        assert apple_4_4_smartphone.getClass() == Apple_4_4_Smartphone.class;
        factory.present(apple_4_4_smartphone);

        final ISmartphone apple_6_7_smartphone = factory.createSmartphone(_6_7_INCHES);
        System.out.println("Apple ISmartPhone implementation of 6.7 inches smartphone:" + apple_6_7_smartphone.getClass());
        assert apple_6_7_smartphone.getClass() == Apple_6_7_Smartphone.class;
        factory.present(apple_6_7_smartphone);
    }
}
