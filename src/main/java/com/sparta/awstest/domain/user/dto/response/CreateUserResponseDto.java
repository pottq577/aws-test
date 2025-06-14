package com.sparta.awstest.domain.user.dto.response;

import com.sparta.awstest.domain.user.entity.User;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponseDto {

    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static CreateUserResponseDto of(User user){
        return new CreateUserResponseDto(
            user.getName(),
            user.getPassword(),
            user.getCreatedAt(),
            user.getModifiedAt()
        );
    }
}
