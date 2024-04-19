package com.amazon.hfchotel.test.splitwise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new UserBuilder()
            .userId("1")
            .userName("John Doe")
            .build();

        User user2 = new UserBuilder()
            .userId("2")
            .userName("Absdfds Doe")
            .build();
        Balance balance = new BalanceBuilder()
            .amount(100.0)
            .currency(Currency.DLR)
            .build();

        Expense expense = new ExpenseBuilder()
            .expenseId("123")
            .expenseName("Hotel Expenses")
            .status(Status.CREATED)
            .balance(balance)
            .build();
        UserService userService = new UserService();
        ExpenseService expenseService = new ExpenseService();
        userService.adduser(user1);
        userService.adduser(user2);
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(expense);
        expenseService.addExpensesForUser(user1, user2, expenseList);
        System.out.println(expenseService.getExpensesForUser(user1, user2));

        Group group = new GroupBuilder()
            .groupId("123")
            .groupName("Family")
            .users(userList)
            .expenses(expenseList)
            .build();

        GroupService groupService = new GroupService();
        groupService.addGroup(group);
        expenseService.addExpensesForGroup(user1, user2, group, expenseList);
        System.out.println(expenseService.getExpensesForGroup(group));
    }
}
