package com.solution.loginSolution.User.Normal.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWithdrawRequestDTO {
    @NotBlank
    private String userEmail;

    @NotBlank
    private String password;
}
