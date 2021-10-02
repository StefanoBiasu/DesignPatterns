package com.stefanobiasu.designpatterns.strategy.human;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.PaperMoneyBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.LakeFishingStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.play.NoPlayVideogamesStrategy;

/**
 * GrandFather.
 */
public class GrandFather extends Human {

    /**
     * Constructor.
     */
    public GrandFather() {
        super(new LakeFishingStrategy(), new PaperMoneyBuyStrategy(), new NoPlayVideogamesStrategy());
    }

    @Override
    public void salute() {
        System.out.println("Hi, I'm a grandfather");
    }
}
