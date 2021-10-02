package com.stefanobiasu.designpatterns.strategy.person;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.PaperMoneyBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.LakeFishingStrategy;

/**
 * Grandfather.
 */
public class Grandfather extends Person {

    /**
     * Constructor.
     */
    public Grandfather() {
        fishingStrategy = new LakeFishingStrategy();
        buyStrategy = new PaperMoneyBuyStrategy();
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm a grandfather");
    }
}
