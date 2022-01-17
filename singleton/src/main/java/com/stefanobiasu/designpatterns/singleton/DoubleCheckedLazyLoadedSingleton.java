package com.stefanobiasu.designpatterns.singleton;

/**
 * Double checked lazy loaded implementation of a Singleton.
 */
public class DoubleCheckedLazyLoadedSingleton {

    private static DoubleCheckedLazyLoadedSingleton instance;

    private DoubleCheckedLazyLoadedSingleton() {
    }

    public static DoubleCheckedLazyLoadedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLazyLoadedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLazyLoadedSingleton();
                }
            }
        }
        return instance;
    }
}
