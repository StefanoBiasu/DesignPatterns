package com.stefanobiasu.designpatterns.strategy.human;

import com.stefanobiasu.designpatterns.strategy.strategies.buy.IBuyStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.fishing.IFishingStrategy;
import com.stefanobiasu.designpatterns.strategy.strategies.play.IPlayVideogamesStrategy;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Abstract implementation of IHuman.
 */
@Slf4j
public abstract class Human implements IHuman {
    private final @NonNull IFishingStrategy rideHorseStrategy;
    private final @NonNull IBuyStrategy buyStrategy;
    private final @NonNull IPlayVideogamesStrategy playStrategy;

    /**
     * Constructor.
     *
     * @param rideHorseStrategy The desided strategy.
     * @param buyStrategy       The desided strategy.
     * @param playStrategy      The desided strategy.
     */
    protected Human(@NonNull IFishingStrategy rideHorseStrategy, @NonNull IBuyStrategy buyStrategy, @NonNull IPlayVideogamesStrategy playStrategy) {
        this.rideHorseStrategy = rideHorseStrategy;
        this.buyStrategy = buyStrategy;
        this.playStrategy = playStrategy;
    }

    public abstract void salute();

    @Override
    public void fishing() {
        rideHorseStrategy.fishing();
    }

    @Override
    public void buy() {
        buyStrategy.buy();
    }

    @Override
    public void playVideogames() {
        playStrategy.play();
    }
}
