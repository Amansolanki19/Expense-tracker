package com.example.expensetrackor.repository;

import com.example.expensetrackor.dto.ExpenseResponseDto;
import com.example.expensetrackor.model.ExpenseData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseDataRepo extends JpaRepository<ExpenseData,Long>{
    List<ExpenseResponseDto> findAllById(Long id);
    List<ExpenseData> findByUserId(Long id);

    Optional<ExpenseData> findById(Long id);

    void deleteByTitle(String title);

    Boolean findByTitle(String title);


}
