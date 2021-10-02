package com.stefanobiasu.designpatterns.strategy;

import com.stefanobiasu.designpatterns.strategy.human.Father;
import com.stefanobiasu.designpatterns.strategy.human.GrandFather;
import com.stefanobiasu.designpatterns.strategy.human.IHuman;
import com.stefanobiasu.designpatterns.strategy.human.Son;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IHuman grandfather = new GrandFather();
        IHuman father = new Father();
        IHuman son = new Son();
        Stream.of(grandfather, father, son).forEach(human -> {
            human.salute();
            human.fishing();
            human.buy();
            human.playVideogames();
        });
    }
}
