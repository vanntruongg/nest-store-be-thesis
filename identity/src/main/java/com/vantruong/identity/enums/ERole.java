package com.vantruong.identity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ERole {
  ADMIN("ADMIN"),
  USER("USER");

  private final String role;
}
