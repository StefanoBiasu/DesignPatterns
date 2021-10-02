package com.stefanobiasu.designpatterns.strategy.strategies.buy;

/**
 * Buy strategy implementation through Bank transfer.
 */
public class BankTransferBuyStrategy implements IBuyStrategy {

    @Override
    public void buy() {
        System.out.println("I buy things using a bank transfer,");
    }
}
