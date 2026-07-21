package com.example.expensetrackor.controller;

import com.example.expensetrackor.dto.ExpenseRequestDto;
import com.example.expensetrackor.dto.ExpenseResponseDto;
import com.example.expensetrackor.service.ExpenseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/expenseData")
public class ExpenseDataController {

    private final ExpenseService expenseService;

    @PostMapping("/create")
    public ResponseEntity<ExpenseResponseDto> createExpense(
            @Valid @RequestBody ExpenseRequestDto expenseRequestDto) {

        return ResponseEntity.ok(expenseService.createExpense(expenseRequestDto));
    }

    @GetMapping("/getAll/{id}")
    public List<ExpenseResponseDto> findAllExpenses(@PathVariable Long id){
        return expenseService.findAllExpenses(id);
    }
}