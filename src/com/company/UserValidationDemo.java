package com.company;

public class UserValidationDemo {

    public static void main(String[] args) {
        User user = new User("Miha", "Sh", 26);
        UserValidationService service = new UserValidationService();

        service.validate(user);

    }
}
