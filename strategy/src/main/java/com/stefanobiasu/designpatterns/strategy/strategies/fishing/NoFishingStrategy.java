package com.stefanobiasu.designpatterns.strategy.strategies.fishing;

/**
 * No fishing action.
 */
public class NoFishingStrategy implements IFishingStrategy {
    @Override
    public void fishing() {
        System.out.println("I don't know how to go fishing,");
    }
}
