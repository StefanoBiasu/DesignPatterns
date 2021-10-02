package com.stefanobiasu.designpatterns.strategy.person;

/**
 * Generic inteface defining person actions.
 */
public interface IPerson {

    /**
     * Fishing action.
     */
    void fishing();

    /**
     * Buy action
     */
    void buy();

    /**
     * Greet action.
     */
    void greet();
}
