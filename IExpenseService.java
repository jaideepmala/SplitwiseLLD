package com.amazon.hfchotel.test.splitwise;

import java.util.List;

public interface IExpenseService {

    void addExpensesForUser(User paidUser, User borrowedUser, List<Expense> expenses);

    void addExpensesForGroup(User paidUser, User borrowedUser, Group group, List<Expense> expenses);

    void deleteExpensesForUser(User paidUser, User borrowedUser, List<Expense> expenses);

    void deleteExpensesForGroup(User paidUser, User borrowedUser, Group group, List<Expense> expenses);

    List<Expense> getExpensesForGroup(Group group);

    List<Expense> getExpensesForUser(User paidUser, User borrowedUser);
}
