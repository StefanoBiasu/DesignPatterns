package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.samsung;

import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.IComponentsFactory;

/**
 * Apple implementation of components factory.
 */
public class SamsungComponentsFactory implements IComponentsFactory {

    @Override
    public String getCPU() {
        return "CPU";
    }

    @Override
    public String getScreen() {
        return "touchscreen";
    }

    @Override
    public String getRAM() {
        return "RAM";
    }

    @Override
    public String getBattery() {
        return "battery";
    }
}
