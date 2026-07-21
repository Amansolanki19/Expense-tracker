package com.example.expensetrackor.service;

import com.example.expensetrackor.dto.ExpenseRequestDto;
import com.example.expensetrackor.dto.ExpenseResponseDto;

public interface ExpenseService {
    ExpenseResponseDto createExpense(ExpenseRequestDto expenseRequestDto);
}
