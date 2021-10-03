package com.stefanobiasu.designpatterns.observer;

import com.stefanobiasu.designpatterns.observer.data.BitcoinDataProvider;
import com.stefanobiasu.designpatterns.observer.data.EthereumDataProvider;
import com.stefanobiasu.designpatterns.observer.observers.BitcoinPriceObserver;
import com.stefanobiasu.designpatterns.observer.observers.EthereumPriceObserver;
import com.stefanobiasu.designpatterns.observer.observers.IPriceObserver;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Create the providers
        var bitcoinProvider = new BitcoinDataProvider();
        var ethereumProvider = new EthereumDataProvider();

        // Create the observers
        IPriceObserver bitcoinObserver = new BitcoinPriceObserver();
        IPriceObserver ethereumObserver = new EthereumPriceObserver();

        // Start providers
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(bitcoinProvider.startProvideData());
        executor.submit(ethereumProvider.startProvideData());

        // Add observers to the providers
        bitcoinProvider.register(bitcoinObserver);
        ethereumProvider.register(ethereumObserver);

        //Wait a second and unregister ethereum observer
        Thread.sleep(1000);
        bitcoinProvider.unregister(bitcoinObserver);

        // Terminate execution
        Utils.shutdownIn(executor, 4);
    }
}
