package com.example.expensetrackor.controller;

import com.example.expensetrackor.dto.LoginRequestDto;
import com.example.expensetrackor.dto.UserRequestDto;
import com.example.expensetrackor.dto.UserResponseDto;
import com.example.expensetrackor.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense/tracker/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public UserResponseDto createUser(
            @Valid @RequestBody UserRequestDto user) {

        return userService.createUser(user);
    }

    @GetMapping("find/{id}")
    public UserResponseDto findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/findAll")
    public List<UserResponseDto> findAll(){
        return userService.findAll();
    }


}