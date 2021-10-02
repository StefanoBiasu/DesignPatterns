package com.stefanobiasu.designpatterns.strategy.person;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.IBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.IFishingStrategy;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Abstract implementation of IPerson.
 */
@Slf4j
public abstract class Person implements IPerson {

    protected @NonNull IFishingStrategy fishingStrategy;

    protected @NonNull IBuyStrategy buyStrategy;

    @Override
    public void fishing() {
        fishingStrategy.fishing();
    }

    @Override
    public void buy() {
        buyStrategy.buy();
    }

    public void setBuyStrategy(IBuyStrategy buyStrategy) {
        this.buyStrategy = buyStrategy;
    }

    public void setFishingStrategy(IFishingStrategy fishingStrategy) {
        this.fishingStrategy = fishingStrategy;
    }
}
