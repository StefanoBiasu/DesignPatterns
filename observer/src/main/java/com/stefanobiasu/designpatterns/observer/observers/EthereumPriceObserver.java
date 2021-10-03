package com.stefanobiasu.designpatterns.observer.observers;

import com.stefanobiasu.designpatterns.observer.providers.IPriceDataProvider;
import lombok.NonNull;

/**
 * Implementation of a Ethereum price observer.
 */
public class EthereumPriceObserver implements IPriceObserver {

    private @NonNull IPriceDataProvider dataProvider;

    @Override
    public void setDataProvider(@NonNull IPriceDataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @Override
    public void onUpdate() {
        display(dataProvider.getPrice());
    }

    private void display(int price) {
        System.out.println("Ethereum price is: " + price);
    }
}
