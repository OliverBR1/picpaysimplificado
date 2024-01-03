package com.picpaysimplificado.dtos;

import com.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstname, String lastname, String document, BigDecimal balance, String email, String password, UserType userType) {
}
