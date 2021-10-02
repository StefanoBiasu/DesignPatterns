package com.stefanobiasu.designpatterns.strategy.strategies.play;

/**
 * No videogame play ever implementation.
 */
public class NoPlayVideogamesStrategy implements IPlayVideogamesStrategy {
    @Override
    public void play() {
        System.out.println("I don't play videogames.");
    }
}
