package com.example.expensetrackor.repository;

import com.example.expensetrackor.model.ExpenseData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseDataRepo extends JpaRepository<ExpenseData,Long>{

}
