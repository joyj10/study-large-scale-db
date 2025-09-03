package com.study.backend.dto;

import com.study.backend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String username;
    private String email;

    public UserResponse(User user) {
        this(user.getId(), user.getUsername(), user.getEmail());
    }
}
