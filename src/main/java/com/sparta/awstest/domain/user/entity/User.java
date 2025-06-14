package com.sparta.awstest.domain.user.entity;

import com.sparta.awstest.domain.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column
    private String name;

    @Column
    private String password;

    public static User from(String name, String password){
        return new User(name, password);
    }
}
