package com.solution.loginSolution.User.General.DTO;

import com.solution.loginSolution.User.General.Entity.Role;
import com.solution.loginSolution.User.General.Entity.GeneralUser;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLoginRequestDTO {
    @NotBlank
    private String userEmail;

    @NotBlank
    private String password;

    public GeneralUser toEntity(String encodedPassword) {
        return GeneralUser.builder()
                .userEmail(userEmail)
                .userPassword(encodedPassword)
                .role(Role.ROLE_MEMBER)
                .build();
    }
}