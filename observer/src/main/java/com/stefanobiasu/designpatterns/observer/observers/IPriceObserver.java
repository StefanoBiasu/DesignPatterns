package com.stefanobiasu.designpatterns.observer.observers;

import com.stefanobiasu.designpatterns.observer.providers.IPriceDataProvider;
import lombok.NonNull;

/**
 * Definition of a price observer.
 */
public interface IPriceObserver {
    /**
     * Sets the provider of data, where it will fetch updated data.
     *
     * @param dataProvider the data provider.
     */
    void setDataProvider(@NonNull IPriceDataProvider dataProvider);

    /**
     * called from provider whenever a new value is provided.
     */
    void onUpdate();
}
