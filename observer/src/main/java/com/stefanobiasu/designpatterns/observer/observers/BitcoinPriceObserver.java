package com.stefanobiasu.designpatterns.observer.observers;

import com.stefanobiasu.designpatterns.observer.data.IPriceDataProvider;
import lombok.NonNull;

/**
 * Implementation of a Bitcoin price observer.
 */
public class BitcoinPriceObserver implements IPriceObserver {

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
        System.out.println("Bitcoin price is: " + price);
    }
}
