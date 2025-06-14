package com.sparta.awstest.domain.user.repository;

import com.sparta.awstest.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    default User findByIdOrElseThrow(Long userId) {
        return findById(userId)
            .orElseThrow(() -> new IllegalArgumentException("유저가 없습니다."));
    }
}
