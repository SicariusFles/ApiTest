package org.example.heplers;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.example.dto.UserData;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class UserHelper {
    @Step("Удаление юзера с username = {0}")
    public static void deleteUser(String userName){
        given()
            .baseUri("https://petstore.swagger.io/")
            .contentType(ContentType.JSON)
        .when()
            .delete("v2/user/{username}", userName)
        .then()
            .log().all()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("schema/CreateUserSchema.json"));
    }

    @Step("Создание юзера c username = Vasua228")
    public static UserData createUser(){
        UserData ud = UserData.builder()
            .username("Vasua228")
            .firstName("Vasua")
            .lastName("Pupcin")
            .email("Vasua@yandex.ru")
            .password("qwerty123")
            .phone("+7999456902")
            .userStatus(0)
            .build();

        given()
            .baseUri("https://petstore.swagger.io/")
            .contentType(ContentType.JSON)
            .body(ud)
        .when()
            .post("v2/user")
            .then()
        .log().all()
            .statusCode(200)
            .body(matchesJsonSchemaInClasspath("schema/CreateUserSchema.json"));

        return ud;
    }
    @Step("Обновление данных пользователя")
    public static UserData updateUser(String actualUserName){
        UserData updateUserData = UserData.builder()
                .username("RetarDick")
                .firstName("Matvey")
                .lastName("Serebryanikov")
                .email("hereretard@gmail.com")
                .password("qwerty12!")
                .phone("+79994426902")
                .userStatus(0)
                .build();

        given()
                .baseUri("https://petstore.swagger.io/")
                .contentType(ContentType.JSON)
                .body(updateUserData)
                .when()
                .put("v2/user/{actualUserData}", actualUserName)
                .then()
                .log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schema/CreateUserSchema.json"));
        return updateUserData;
    }
    @Step("Получение данных пользователя с именем = {0}")
    public static void getUserData(String userName){
        given()
                .baseUri("https://petstore.swagger.io/")
                .contentType(ContentType.JSON)
                .when()
                .get("v2/user/{username}", userName)
                .then()
                .log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("schema/GetUserSchema.json"));
    }
}
