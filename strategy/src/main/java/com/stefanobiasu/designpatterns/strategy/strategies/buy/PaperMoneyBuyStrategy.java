package com.stefanobiasu.designpatterns.strategy.strategies.buy;

/**
 * Implementation IBuyStrategy using sheer paper money.
 */
public class PaperMoneyBuyStrategy implements IBuyStrategy {
    @Override
    public void buy() {
    System.out.println("I pay only with paper money,");
    }
}
