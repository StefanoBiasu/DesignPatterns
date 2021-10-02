package com.stefanobiasu.designpatterns.strategy.strategies.buy;

/**
 * Implementation of IBuyStrategy with crypto currencies
 */
public class CryptoBuyStrategy implements IBuyStrategy {
    @Override
    public void buy() {
        System.out.println("I pay everything with crypto currencies,");
    }
}
