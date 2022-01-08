package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.apple;

import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.AbstractSmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.IComponentsFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.ISmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.apple.Apple_4_4_Smartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.apple.Apple_6_7_Smartphone;

/**
 * Implementation of {@link ISmartphoneFactory}.
 */
public class AppleSmartphoneFactory extends AbstractSmartphoneFactory {

    @Override
    public ISmartphone createSmartphone(String size) {

        IComponentsFactory componentsFactory = getComponentFactory(APPLE_COMPONENTS);

        if (size.equals(ISmartphoneFactory._4_4_INCHES)) {
            final Apple_4_4_Smartphone smartphone = new Apple_4_4_Smartphone();
            return assemble(smartphone, componentsFactory);
        } else if (size.equals(ISmartphoneFactory._6_7_INCHES)) {
            final Apple_6_7_Smartphone smartphone = new Apple_6_7_Smartphone();
            return assemble(smartphone, componentsFactory);
        } else {
            throw new RuntimeException("not a valid size");
        }
    }
}
