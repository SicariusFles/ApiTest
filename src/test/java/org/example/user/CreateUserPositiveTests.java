package org.example.user;

import io.qameta.allure.Description;
import org.example.dto.UserData;
import org.example.heplers.UserHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateUserPositiveTests {
    @Test
    @DisplayName("POST v2/user")
    @Description("Тест создание юзера")
    public void createUserTest() {
        UserData ud = UserHelper.createUser();
        UserHelper.deleteUser(ud.getUsername());
    }
}
