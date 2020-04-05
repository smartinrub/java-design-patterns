package com.sergiomartinrubio.javadesignpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // --- Singleton with immutable public field ---
        ImmutablePublicFieldSingleton instanceWithPublicField = ImmutablePublicFieldSingleton.instance;

        instanceWithPublicField.setValue(100);
        System.out.println(instanceWithPublicField.getValue());

        // reflection concept to get constructor of a Singleton class.
        Constructor<ImmutablePublicFieldSingleton> constructor = ImmutablePublicFieldSingleton.class.getDeclaredConstructor();
        // change the accessibility of constructor for outside a class object creation.
        constructor.setAccessible(true);

        // creates first object of a class as constructor is accessible now.
        ImmutablePublicFieldSingleton firstSingleton = constructor.newInstance();
        firstSingleton.setValue(5);

        // creates second object of a class as constructor is accessible now.
        ImmutablePublicFieldSingleton secondSingleton = constructor.newInstance();
        secondSingleton.setValue(10);
        System.out.println(secondSingleton.getValue()); // value = 10
        System.out.println(firstSingleton.getValue()); // value = 5

        constructor.setAccessible(false);


        // --- Singleton with factory method ---
        FactoryMethodSingleton instanceWithFactoryMethod = FactoryMethodSingleton.getInstance();

        instanceWithFactoryMethod.setValue(200);
        System.out.println(instanceWithFactoryMethod.getValue());

        // --- Lazy Initialisation And Double Check Locking Pattern ---
        LazyInitializationAndDoubleCheckLockingSingleton lazyInitializationAndDoubleCheckLockingSingleton
                = LazyInitializationAndDoubleCheckLockingSingleton.getInstance();

        lazyInitializationAndDoubleCheckLockingSingleton.setValue(300);
        System.out.println(lazyInitializationAndDoubleCheckLockingSingleton.getValue());

        // --- Enum ---
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        enumSingleton.setValue(400);
        System.out.println(enumSingleton.getValue());
    }
}
