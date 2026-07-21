package com.example.expensetrackor.service;

import com.example.expensetrackor.dto.UserRequestDto;
import com.example.expensetrackor.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    UserResponseDto createUser(UserRequestDto user);

    UserResponseDto findById(Long id);

    List<UserResponseDto> findAll();
}