package com.vantruong.identity.dto;

import com.vantruong.identity.entity.Role;
import com.vantruong.identity.entity.User;

import java.time.LocalDate;
import java.util.Set;

public record UserDto(String email,
                      String firstName,
                      String lastName,
                      String phone,
                      String status,
                      String imageUrl,
                      Set<Role> roles
) {
  public static UserDto fromEntity(User user) {
    return new UserDto(user.getEmail(),
            user.getFirstName(),
            user.getLastName(),
            user.getPhone(),
            user.getStatus().name(),
            user.getImageUrl(),
            user.getRoles());
  }
}