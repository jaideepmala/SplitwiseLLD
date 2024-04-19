package com.amazon.hfchotel.test.splitwise;

import java.util.Objects;

public class Expense {

    private String expenseId;
    private String expenseName;
    private Status status;
    private Balance balance;

    public Expense(final String expenseId, final String expenseName, final Status status,
        final Balance balance) {

        this.expenseId = expenseId;
        this.expenseName = expenseName;
        this.status = status;
        this.balance = balance;
    }

    public String getExpenseId() {

        return expenseId;
    }

    public void setExpenseId(final String expenseId) {

        this.expenseId = expenseId;
    }

    public String getExpenseName() {

        return expenseName;
    }

    public void setExpenseName(final String expenseName) {

        this.expenseName = expenseName;
    }

    public Status getStatus() {

        return status;
    }

    public void setStatus(final Status status) {

        this.status = status;
    }

    public Balance getBalance() {

        return balance;
    }

    public void setBalance(final Balance balance) {

        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null && this.getClass() != o.getClass())
            return false;

        Expense e = (Expense) o;
        return Objects.equals(e.expenseId, expenseId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(expenseId);
    }

    @Override
    public String toString() {

        return "Expense{" +
            "expenseId='" + expenseId + '\'' +
            ", expenseName='" + expenseName + '\'' +
            ", status=" + status +
            ", balance=" + balance +
            '}';
    }
}
