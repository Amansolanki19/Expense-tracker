package com.example.expensetrackor.dto;

import com.example.expensetrackor.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseResponseDto {

    private Long id;
    private Double amount;
    private String description;
    private String category;
    private Status status;

    private Long userId;
    private String userName;
    private String userEmail;
}