package com.stefanobiasu.designpatterns.observer.providers;

import com.stefanobiasu.designpatterns.observer.observers.IPriceObserver;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Bitcoin data provider.
 */
public class BitcoinDataProvider implements IPriceDataProvider {

    private List<IPriceObserver> observers = new LinkedList<>();
    private int bitcoinPrice = 0;

    /**
     * Util method to simulate the price fluctuation in time read by the provider.
     *
     * @return a runnable
     */
    public Runnable startProvideData() {
        return () -> {
            while (true) {
                try {
                    Thread.sleep(new Random().nextInt(100));
                    bitcoinPrice = CryptoDataSource.getBitcoinPrice();
                    notifyObservers();
                } catch (InterruptedException exception) {
                    break;
                }
            }
            System.out.println("Finished to provide bitcoin price samples");
        };
    }

    @Override
    public List<IPriceObserver> getObservers() {
        return observers;
    }

    @Override
    public int getPrice() {
        return bitcoinPrice;
    }
}
