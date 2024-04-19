package com.amazon.hfchotel.test.splitwise;

public class Balance {

    private double amount;
    private Currency currency;

    public Balance(final double amount, final Currency currency) {

        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(final double amount) {

        this.amount = amount;
    }

    public Currency getCurrency() {

        return currency;
    }

    public void setCurrency(final Currency currency) {

        this.currency = currency;
    }

    @Override
    public String toString() {

        return "Balance{" +
            "amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
