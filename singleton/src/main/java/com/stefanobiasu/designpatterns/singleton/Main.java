package com.stefanobiasu.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {

        DoubleCheckedLazyLoadedSingleton s1 = DoubleCheckedLazyLoadedSingleton.getInstance();
        DoubleCheckedLazyLoadedSingleton s2 = DoubleCheckedLazyLoadedSingleton.getInstance();

        System.out.println("is singleton instance 1 equal to instance 2?: " + (s1 == s2));

        EnumSingleton enumSingleTon1 = EnumSingleton.ENUM_SINGLETON_INSTANCE;
        EnumSingleton enumSingleTon2 = EnumSingleton.ENUM_SINGLETON_INSTANCE;
        String value = "someValue";
        enumSingleTon1.setSomeValue(value);
        System.out.println("is enum singleton instance 1 value instance 2 value?: " + enumSingleTon2.getSomeValue().equals(enumSingleTon2.getSomeValue()));
    }
}
