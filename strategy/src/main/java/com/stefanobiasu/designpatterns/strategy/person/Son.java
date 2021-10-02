package com.stefanobiasu.designpatterns.strategy.person;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.PaperMoneyBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.LakeFishingStrategy;

/**
 * Son.
 */
public class Son extends Person {

    /**
     * Constructor.
     */
    public Son() {
        fishingStrategy = new LakeFishingStrategy();
        buyStrategy = new PaperMoneyBuyStrategy();
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm a son.");
    }
}
