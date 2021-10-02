package com.stefanobiasu.designpatterns.strategy.human;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.CryptoBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.play.PlayStationPlayVideogamesStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.NoFishingStrategy;

/**
 * Son.
 */
public class Son extends Human {

    /**
     * Constructor.
     */
    public Son() {
        super(new NoFishingStrategy(), new CryptoBuyStrategy(), new PlayStationPlayVideogamesStrategy());
    }

    @Override
    public void salute() {
        System.out.println("Hi, I'm a son.");
    }
}
