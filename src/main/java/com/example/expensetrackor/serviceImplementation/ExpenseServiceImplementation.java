package com.example.expensetrackor.serviceImplementation;

import com.example.expensetrackor.dto.ExpenseRequestDto;
import com.example.expensetrackor.dto.ExpenseResponseDto;
import com.example.expensetrackor.model.ExpenseData;
import com.example.expensetrackor.model.Users;
import com.example.expensetrackor.repository.ExpenseDataRepo;
import com.example.expensetrackor.repository.UserRepo;
import com.example.expensetrackor.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImplementation implements ExpenseService {

    private final UserRepo userRepo;
    private final ExpenseDataRepo expenseDataRepo;

    @Override
    public ExpenseResponseDto createExpense(ExpenseRequestDto request) {

        Users user = userRepo.findById(request.getUserId())
                .orElseThrow(() ->
                        new RuntimeException("User not found with id : " + request.getUserId()));

        ExpenseData expense = ExpenseData.builder()
                .amount(request.getAmount())
                .description(request.getDescription())
                .category(request.getCategory())
                .status(request.getStatus())
                .user(user)
                .build();

        ExpenseData savedExpense = expenseDataRepo.save(expense);

        return new ExpenseResponseDto(
                savedExpense.getId(),
                savedExpense.getAmount(),
                savedExpense.getDescription(),
                savedExpense.getCategory(),
                savedExpense.getStatus(),
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    @Override
    public List<ExpenseResponseDto> findAllExpenses(Long id) {

        Users user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        List<ExpenseData> expenses = expenseDataRepo.findByUserId(id);

        return expenses.stream()
                .map(expense -> new ExpenseResponseDto(
                        expense.getId(),
                        expense.getAmount(),
                        expense.getDescription(),
                        expense.getCategory(),
                        expense.getStatus(),
                        user.getId(),
                        user.getName(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }
}