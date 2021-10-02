package com.stefanobiasu.designpatterns.strategy.person;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.PaperMoneyBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.NoFishingStrategy;

/**
 * Father.
 */
public class Father extends Grandfather {

    /**
     * Constructor.
     */
    public Father() {
        fishingStrategy = new NoFishingStrategy();
        buyStrategy = new PaperMoneyBuyStrategy();
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm a father");
    }
}
