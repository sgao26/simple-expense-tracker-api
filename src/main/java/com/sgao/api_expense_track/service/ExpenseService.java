package com.sgao.api_expense_track.service;

import com.sgao.api_expense_track.model.Expense;
import com.sgao.api_expense_track.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public Expense addExpense(Expense expense) {
        return repo.save(expense);
    }

    public List<Expense> getAll() {
        return repo.findAll();
    }
}