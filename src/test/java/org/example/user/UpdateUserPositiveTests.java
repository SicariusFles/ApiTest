package org.example.user;

import io.qameta.allure.Description;
import org.example.dto.UserData;
import org.example.heplers.UserHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UpdateUserPositiveTests {
    @Test
    @DisplayName("PUT v2/user/actualUserData")
    @Description("Тест обновления данных пользователя")
    public void updateUserTest(){
        UserData actualUserData = UserHelper.createUser();
        UserData updateUserData = UserHelper.updateUser(actualUserData.getUsername());
        UserHelper.deleteUser(updateUserData.getUsername());
    }
}
