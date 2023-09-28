package com.splitwise.dtos;

import com.splitwise.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponseDto {
    private User user;

    public CreateUserResponseDto(User user) {
        this.user = user;
    }
}
