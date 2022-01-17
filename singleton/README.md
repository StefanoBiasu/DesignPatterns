
# Singleton Pattern

## Definition

The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it. 

## Example

In order to have a single instance for JVM of a class, it's necessary to hinder the access to the constructor of such class.
Also, it could be useful to provide lazy loading for the initialization. The keyword for a global access is "static", 
while lazy loading can be achieved checking if the instance has already been initialized.
 
```java
    private static LazyLoadedSingleton instance;

    private LazyLoadedSingleton() {
    }

    public static LazyLoadedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }
 ```

An issue that can arise here is the possibility to run the code in a multithreaded environment. In this case, it's 
possible that two threads execute the same code at the same time, evaluating if "(instance == null)" both as true, thus 
generating two instances of a Singleton. The way to avoid it is to synchronize the creation of the instance with a 
syncrhonized block with the lock being the same Singleton class. Also, since synchronized code is cumbersome, it's better
to optimize it checking beforehand whether the instance is already available, introducing a double check on the instance
 nullability:

```java
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
 ```

A final note is that this code still does not prevent a creation of multiple instances of a Singleton class. In fact, 
Serialization and Reflection can still access to the constructor. Sacrificing the lazy loading of the Singleton, it's 
possible to have a fully compliant Singleton with Enums. Enums have internal mechanisms for instantiation, unaccessible 
even with reflection or serialization:
```java
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
```

Test the different implementations:
```java
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
```

Print result:

```
is singleton instance 1 equal to instance 2?: true
is enum singleton instance 1 value instance 2 value?: true
```