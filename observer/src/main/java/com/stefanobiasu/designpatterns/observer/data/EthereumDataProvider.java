package com.stefanobiasu.designpatterns.observer.data;

import com.stefanobiasu.designpatterns.observer.observers.IPriceObserver;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Ethereum data provider.
 */
public class EthereumDataProvider implements IPriceDataProvider {

    private List<IPriceObserver> observers = new LinkedList<>();
    private int ethereumPrice = 0;

    /**
     * Util method to simulate the price fluctuation in time read by the provider.
     *
     * @return a runnable
     */
    public Runnable startProvideData() {
        return () -> {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(500));
                    ethereumPrice = CryptoDataSource.getEthereumPrice();
                    notifyObservers();
                } catch (InterruptedException exception) {
                    break;
                }
            }
            System.out.println("Finished to provide ethereum price samples");
        };
    }

    @Override
    public List<IPriceObserver> getObservers() {
        return observers;
    }

    @Override
    public int getPrice() {
        return ethereumPrice;
    }
}
