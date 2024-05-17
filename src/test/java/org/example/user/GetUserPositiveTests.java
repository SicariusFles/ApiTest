package org.example.user;

import io.qameta.allure.Description;
import org.example.dto.UserData;
import org.example.heplers.UserHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetUserPositiveTests {
    @Test
    @DisplayName("GET v2/user/username")
    @Description("Тест по получению пользователя")
    public void getUserTest(){
        UserData userData = UserHelper.createUser();
        UserHelper.getUserData(userData.getUsername());
        UserHelper.deleteUser(userData.getUsername());
    }
}
