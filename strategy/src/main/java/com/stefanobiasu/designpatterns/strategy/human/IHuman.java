package com.stefanobiasu.designpatterns.strategy.human;

/**
 * Generic inteface defining human actions.
 */
public interface IHuman {

    /**
     * Fishing action.
     */
    void fishing();

    /**
     * Buy action
     */
    void buy();

    /**
     * Play action
     */
    void playVideogames();

    /**
     * Salute action.
     */
    void salute();
}
