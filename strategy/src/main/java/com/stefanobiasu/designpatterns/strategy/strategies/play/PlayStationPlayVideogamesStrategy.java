package com.stefanobiasu.designpatterns.strategy.strategies.play;

/**
 * Implementation of IPlayStrategy using PlayStation.
 */
public class PlayStationPlayVideogamesStrategy implements IPlayVideogamesStrategy {

    @Override
    public void play() {
        System.out.println("I usually boot up PlayStation and start playing.");
    }
}
