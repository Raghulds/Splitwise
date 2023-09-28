package com.splitwise.repositories;

import com.splitwise.models.Expense;

import java.util.List;

//@Repository  //  extends JpaRepository<Expense, Long>
public interface ExpenseRepository {
    Expense save(Expense expense);
    Expense findExpenseById(long id);
    List<Expense> getAllExpensesOfUser(long id);
}
