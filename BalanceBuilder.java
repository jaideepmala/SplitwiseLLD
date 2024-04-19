package com.amazon.hfchotel.test.splitwise;

public class BalanceBuilder {

    private double amount;
    private Currency currency;

    public BalanceBuilder amount(double amount) {

        this.amount = amount;
        return this;
    }

    public BalanceBuilder currency(Currency currency) {

        this.currency = currency;
        return this;
    }

    public Balance build() {

        return new Balance(amount, currency);
    }
}
