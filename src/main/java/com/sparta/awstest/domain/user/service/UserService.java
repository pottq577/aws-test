package com.sparta.awstest.domain.user.service;

import com.sparta.awstest.domain.user.dto.request.CreateUserRequestDto;
import com.sparta.awstest.domain.user.dto.response.CreateUserResponseDto;
import com.sparta.awstest.domain.user.entity.User;
import com.sparta.awstest.domain.user.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public CreateUserResponseDto create(CreateUserRequestDto request) {
        User user = User.from(request.getName(), request.getPassword());

        userRepository.save(user);

        return CreateUserResponseDto.of(user);
    }

    @Transactional(readOnly = true)
    public List<CreateUserResponseDto> findAll() {
        List<User> all = userRepository.findAll();
        return all.stream().map(CreateUserResponseDto::of).toList();
    }

    @Transactional(readOnly = true)
    public CreateUserResponseDto findOne(Long userId) {
        User user = userRepository.findByIdOrElseThrow(userId);
        return CreateUserResponseDto.of(user);
    }
}
