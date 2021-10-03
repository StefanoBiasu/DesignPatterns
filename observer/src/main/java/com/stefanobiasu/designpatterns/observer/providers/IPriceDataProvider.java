package com.stefanobiasu.designpatterns.observer.providers;

import com.stefanobiasu.designpatterns.observer.observers.IPriceObserver;
import lombok.NonNull;

import java.util.List;

/**
 * Provider of data. A provider has a register of observers which it notifies at a specific pace.
 */
public interface IPriceDataProvider {
    /**
     * Gets the observers.
     *
     * @return The observers.
     */
    List<IPriceObserver> getObservers();

    /**
     * Registers a new observer.
     *
     * @param observer a new observer
     */
    default void register(@NonNull IPriceObserver observer) {
        getObservers().add(observer);
        observer.setDataProvider(this);
        System.out.println("Observer registered: " + observer);
    }

    /**
     * Unregister observer.
     *
     * @param observer
     */
    default void unregister(@NonNull IPriceObserver observer) {
        getObservers().remove(observer);
        System.out.println("Observer unregistered: " + observer);
    }

    /**
     * Notifies observers calling IPriceObserver.onUpdate().
     */
    default void notifyObservers() {
        getObservers().forEach(IPriceObserver::onUpdate);
    }

    /**
     * Returns the updated value to the observer, whenever needed.
     *
     * @return The price
     */
    int getPrice();

}