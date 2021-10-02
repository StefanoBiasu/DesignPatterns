package com.stefanobiasu.designpatterns.strategy.strategies.play;

/**
 * Implementation of IPlayStrategy using a computer.
 */
public class ComputerPlayVideogamesStrategy implements IPlayVideogamesStrategy {
    @Override
    public void play() {
        System.out.println("When I want to play, I boot up a PC and play.");
    }
}
