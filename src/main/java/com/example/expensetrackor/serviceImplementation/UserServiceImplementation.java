package com.example.expensetrackor.serviceImplementation;

import com.example.expensetrackor.dto.UserRequestDto;
import com.example.expensetrackor.dto.UserResponseDto;
import com.example.expensetrackor.model.Users;
import com.example.expensetrackor.repository.UserRepo;
import com.example.expensetrackor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepo userRepo;

    @Override
    public UserResponseDto findById(Long id) {

        Users user = userRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }

    @Override
    public UserResponseDto createUser(UserRequestDto user) {

        Users users = Users.builder()
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .createdAt(LocalDateTime.now())
                .build();

        Users savedUser = userRepo.save(users);

        return new UserResponseDto(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail()
        );


    }

    @Override
    public List<UserResponseDto> findAll() {
        List<Users> users = userRepo.findAll();

        return users.stream()
                .map(user -> new UserResponseDto(
                        user.getId(),
                        user.getName(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }


}