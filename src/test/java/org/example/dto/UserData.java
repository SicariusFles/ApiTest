package org.example.dto;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Value
public class UserData {
    Integer id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    Integer userStatus;
}
