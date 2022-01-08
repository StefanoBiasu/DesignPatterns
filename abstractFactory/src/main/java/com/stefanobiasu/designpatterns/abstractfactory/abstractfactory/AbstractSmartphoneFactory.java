package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory;

import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.apple.AppleComponentFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.samsung.SamsungComponentFactory;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;

/**
 * Abstract implementation of {@link ISmartphoneFactory}, that retrieves the componentFactory.
 */
public abstract class AbstractSmartphoneFactory implements ISmartphoneFactory {

    protected IComponentsFactory getComponentFactory(String brand) {
        if (brand.equals(APPLE_COMPONENTS)) {
            return new AppleComponentFactory();
        } else if (brand.equals(SAMSUNG_COMPONENTS)) {
            return new SamsungComponentFactory();
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
