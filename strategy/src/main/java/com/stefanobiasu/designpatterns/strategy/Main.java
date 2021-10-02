package com.stefanobiasu.designpatterns.strategy;

import com.stefanobiasu.designpatterns.strategy.person.Father;
import com.stefanobiasu.designpatterns.strategy.person.Grandfather;
import com.stefanobiasu.designpatterns.strategy.person.Person;
import com.stefanobiasu.designpatterns.strategy.person.Son;
import com.stefanobiasu.designpatterns.strategy.strategies.buy.CryptoBuyStrategy;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        var grandfather = new Grandfather();
        var father = new Father();
        var son = new Son();
        Stream.of(grandfather, father, son).forEach(person -> {
           presentPerson(person);
        });

        // Let's change the father buy strategy, enabling crypto payments
        System.out.println("Changing father's buy strategy ... ");
        father.setBuyStrategy(new CryptoBuyStrategy());
        presentPerson(father);
    }

    private static void presentPerson(Person person) {
        person.greet();
        person.fishing();
        person.buy();
    }
}
