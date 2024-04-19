package com.amazon.hfchotel.test.splitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseService implements IExpenseService {

    private Map<String, List<Expense>> userExpenseMap;
    private Map<String, Map<String, List<Expense>>> groupExpenseMap;

    public ExpenseService() {

        userExpenseMap = new HashMap<>();
        groupExpenseMap = new HashMap<>();
    }

    @Override
    public void addExpensesForUser(final User paidUser, final User borrowedUser,
        final List<Expense> expenses) {

        final String userExpenseKey = paidUser.getUserId().concat(borrowedUser.getUserId());
        userExpenseMap.put(userExpenseKey, expenses);
    }

    @Override
    public void addExpensesForGroup(final User paidUser, final User borrowedUser, final Group group,
        final List<Expense> expenses) {

        final String userExpenseKey = paidUser.getUserId().concat(borrowedUser.getUserId());
        userExpenseMap.put(userExpenseKey, expenses);
        groupExpenseMap.put(group.getGroupId(), userExpenseMap);
    }

    @Override
    public void deleteExpensesForUser(final User paidUser, final User borrowedUser,
        final List<Expense> expenses) {

        final String userExpenseKey = paidUser.getUserId().concat(borrowedUser.getUserId());
        List<Expense> currentExpenses = userExpenseMap.get(userExpenseKey);
        currentExpenses.removeAll(expenses);
        userExpenseMap.put(userExpenseKey, currentExpenses);
    }

    @Override
    public void deleteExpensesForGroup(final User paidUser, final User borrowedUser,
        final Group group, final List<Expense> expenses) {

        Map<String, List<Expense>> groupExpenses = groupExpenseMap.get(group.getGroupId());
        final String userExpenseKey = paidUser.getUserId().concat(borrowedUser.getUserId());
        List<Expense> currentExpenses = groupExpenses.get(userExpenseKey);
        currentExpenses.removeAll(expenses);
        groupExpenses.put(userExpenseKey, currentExpenses);
        groupExpenseMap.put(group.getGroupId(), groupExpenses);
    }

    @Override
    public List<Expense> getExpensesForGroup(final Group group) {

        Map<String, List<Expense>> groupExpenses = groupExpenseMap.get(group.getGroupId());
        List<Expense> groupExpensesList = new ArrayList<>();
        for (Map.Entry<String, List<Expense>> entry : groupExpenses.entrySet()) {
            groupExpensesList.addAll(entry.getValue());

        }
        return groupExpensesList;
    }

    @Override
    public List<Expense> getExpensesForUser(final User paidUser, final User borrowedUser) {

        final String userExpenseKey = paidUser.getUserId().concat(borrowedUser.getUserId());
        return userExpenseMap.get(userExpenseKey);
    }
}
