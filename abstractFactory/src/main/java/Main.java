import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.ISmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.apple.AppleSmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.samsung.SamsungSmartphoneFactory;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.ISmartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.apple.Apple_4_4_Smartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.apple.Apple_6_7_Smartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung.Samsung_4_4_Smartphone;
import com.stefanobiasu.designpatterns.abstractfactory.smartphone.samsung.Samsung_6_7_Smartphone;

import static com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.ISmartphoneFactory._4_4_INCHES;
import static com.stefanobiasu.designpatterns.abstractfactory.abstractfactory.ISmartphoneFactory._6_7_INCHES;

public class Main {

    public static void main(String[] args) {

        ISmartphoneFactory appleFactory = new AppleSmartphoneFactory();

        final ISmartphone apple_4_4_smartphone = appleFactory.createSmartphone(_4_4_INCHES);
        System.out.println("Apple ISmartPhone implementation of 4.4 inches smartphone:" + apple_4_4_smartphone.getClass());
        assert apple_4_4_smartphone.getClass() == Apple_4_4_Smartphone.class;

        final ISmartphone apple_6_7_smartphone = appleFactory.createSmartphone(_6_7_INCHES);
        System.out.println("Apple ISmartPhone implementation of 6.7 inches smartphone:" + apple_6_7_smartphone.getClass());
        assert apple_6_7_smartphone.getClass() == Apple_6_7_Smartphone.class;

        ISmartphoneFactory samsungFactory = new SamsungSmartphoneFactory();

        final ISmartphone samsung_4_4_smartphone = samsungFactory.createSmartphone(_4_4_INCHES);
        System.out.println("Samsung ISmartPhone implementation of 4.4 inches smartphone:" + samsung_4_4_smartphone.getClass());
        assert samsung_4_4_smartphone.getClass() == Samsung_4_4_Smartphone.class;

        final ISmartphone samsung_6_7_smartphone = samsungFactory.createSmartphone(_6_7_INCHES);
        System.out.println("Samsung ISmartPhone implementation of 6.7 inches smartphone:" + samsung_6_7_smartphone.getClass());
        assert samsung_6_7_smartphone.getClass() == Samsung_6_7_Smartphone.class;
    }
}
