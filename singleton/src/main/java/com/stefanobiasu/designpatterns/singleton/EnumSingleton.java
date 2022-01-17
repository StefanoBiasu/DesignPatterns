package com.stefanobiasu.designpatterns.singleton;

/**
 * Enum implementation of Singleton.
 */
public enum EnumSingleton {

    ENUM_SINGLETON_INSTANCE;

    String someValue;

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }
}
