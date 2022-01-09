package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory;

import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.apple.AppleComponentsFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.samsung.SamsungComponentsFactory;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;

/**
 * Abstract implementation of {@link ISmartphoneFactory}, that retrieves the componentsFactory.
 */
public abstract class AbstractSmartphoneFactory implements ISmartphoneFactory {

    protected IComponentsFactory getComponentFactory(String brand) {
        if (brand.equals(APPLE_COMPONENTS)) {
            return new AppleComponentsFactory();
        } else if (brand.equals(SAMSUNG_COMPONENTS)) {
            return new SamsungComponentsFactory();
        }
        throw new RuntimeException("component factory not found");
    }

    /**
     * Assembles a phone using a component factory.
     *
     * @param phone             the phone to assemble
     * @param componentsFactory the component factory
     */
    protected ISmartphone assemble(ISmartphone phone, IComponentsFactory componentsFactory) {
        componentsFactory.getBattery();
        componentsFactory.getCPU();
        componentsFactory.getRAM();
        componentsFactory.getScreen();
        // assembles the phone
        return phone;
    }
}
