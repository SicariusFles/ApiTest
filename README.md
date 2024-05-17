Написать API - автотесты для сайта https://petstore.swagger.io/ по одному методу из любых блоков (GET,PUT,POST,DELETE).

### DTO:
* UserData - модель юзера

### HELPERS
* UserHelpers - класс помощник тестов

### TESTS
* CreateUserPositiveTests - класс позитивных тестов по созданию юзера
* DeleteUserPositiveTests - класс позитивных тестов по удалению юзера 
* GetUserPositiveTests - класс позитивных тестов по получению данных юзера
* UpdateUserPositiveTests - класс позитивных тестов по обновлению данных юзера

### ЗАПУСК ТЕСТОВ
```mvn clean test``` 

### ЗАПУСК ALLURE
```cd \target```
```allure serve```
