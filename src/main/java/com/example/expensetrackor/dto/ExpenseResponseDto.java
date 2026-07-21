package com.example.expensetrackor.dto;

import com.example.expensetrackor.model.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseResponseDto {

    private Long id;
    private String title;
    private Double amount;
    private String description;
    private String category;
    private Status status;

    private Long userId;
    private String userName;
    private String userEmail;
}