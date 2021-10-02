package com.stefanobiasu.designpatterns.strategy.human;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.BankTransferBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.LakeFishingStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.play.ComputerPlayVideogamesStrategy;

/**
 * Father.
 */
public class Father extends Human {
    /**
     * Constructor.
     */
    public Father() {
        super(new LakeFishingStrategy(), new BankTransferBuyStrategy(), new ComputerPlayVideogamesStrategy());
    }

    @Override
    public void salute() {
        System.out.println("Hi, I'm a father");
    }
}
