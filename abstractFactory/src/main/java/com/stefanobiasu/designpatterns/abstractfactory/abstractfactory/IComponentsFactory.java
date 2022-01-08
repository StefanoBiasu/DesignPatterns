package com.stefanobiasu.designpatterns.abstractfactory.abstractfactory;

/**
 * Definition of a component provider.
 */
public interface IComponentsFactory {

    /**
     * Provides a CPU.
     *
     * @return the CPU.
     */
    String getCPU();

    /**
     * Provides a touchscreen.
     *
     * @return the touchscreen.
     */
    String getScreen();

    /**
     * Provides a RAM.
     *
     * @return the RAM.
     */
    String getRAM();

    /**
     * Provides a battery.
     *
     * @return the battery.
     */
    String getBattery();
}
