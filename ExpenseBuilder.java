package com.amazon.hfchotel.test.splitwise;

public class ExpenseBuilder {

    private String expenseId;
    private String expenseName;
    private Status status;
    private Balance balance;

    public ExpenseBuilder expenseId(String expenseId) {

        this.expenseId = expenseId;
        return this;
    }

    public ExpenseBuilder expenseName(String expenseName) {

        this.expenseName = expenseName;
        return this;
    }

    public ExpenseBuilder status(Status status) {

        this.status = status;
        return this;
    }

    public ExpenseBuilder balance(Balance balance) {

        this.balance = balance;
        return this;
    }

    public Expense build() {

        return new Expense(expenseId, expenseName, status, balance);
    }
}
