package com.stefanobiasu.designpatterns.observer.providers;

import java.util.Random;

/**
 * Source of data for Crypto prices
 */
public final class CryptoDataSource {

    private CryptoDataSource() {
    }

    public static int getBitcoinPrice() {
        return new Random().nextInt(40000);
    }

    public static int getEthereumPrice() {
        return new Random().nextInt(3000);
    }
}
