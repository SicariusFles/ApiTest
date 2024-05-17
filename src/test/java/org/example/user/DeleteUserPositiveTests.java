package org.example.user;

import io.qameta.allure.Description;
import org.example.dto.UserData;
import org.example.heplers.UserHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteUserPositiveTests {
    @Test
    @DisplayName("DELETE v2/user/username")
    @Description("Тест по удалению юзера")
    public void deleteUserTest() {
        UserData userData = UserHelper.createUser();
        UserHelper.deleteUser(userData.getUsername());
    }
}
