package com.stefanobiasu.designpatterns.strategy.strategies.fishing;

/**
 * Implementation of IFishingStrategy in lake.
 */
public class LakeFishingStrategy implements IFishingStrategy {
    @Override
    public void fishing() {
        System.out.println("I go fishing at lake,");
    }
}
