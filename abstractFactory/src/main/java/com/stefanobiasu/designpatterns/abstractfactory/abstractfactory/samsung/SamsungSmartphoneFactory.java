package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.samsung;

import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.AbstractSmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.IComponentsFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.ISmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung.Samsung_4_4_Smartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung.Samsung_6_7_Smartphone;

/**
 * Implementation of {@link ISmartphoneFactory}.
 */
public class SamsungSmartphoneFactory extends AbstractSmartphoneFactory {

    @Override
    public ISmartphone createSmartphone(String size) {

        IComponentsFactory componentsFactory = getComponentFactory(SAMSUNG_COMPONENTS);

        if (size.equals(ISmartphoneFactory._4_4_INCHES)) {
            final Samsung_4_4_Smartphone smartphone = new Samsung_4_4_Smartphone();
            return assemble(smartphone, componentsFactory);
        } else if (size.equals(ISmartphoneFactory._6_7_INCHES)) {
            final Samsung_6_7_Smartphone smartphone = new Samsung_6_7_Smartphone();
            return assemble(smartphone, componentsFactory);
        } else {
            throw new RuntimeException("not a valid size");
        }
    }
}
