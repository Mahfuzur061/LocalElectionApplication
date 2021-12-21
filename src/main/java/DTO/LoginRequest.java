package DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class LoginRequest {

    String username;
    String password;
}
