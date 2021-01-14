package com.company;

public class UserValidationTest {

    public static void ShortFirstNameTest() {
        User user = new User("Le", "ValidSecond", 25);
        UserValidationService validationService = new UserValidationService();
        String actualValidationServiceMessage = validationService.validate(user);
        String expectedValidationServiceMessege = UserValidationException.INVALID_FIRSTNAME_ERROR;
        if (expectedValidationServiceMessege.equals(actualValidationServiceMessage)) {
            System.out.println("Short first name test PASSED");
        } else System.out.println("Short first name test FAILED");
    }
    public static void LongFirstNameTest() {
        User user = new User("Lee keep hands free", "Secondname", 25);
        UserValidationService validationService = new UserValidationService();
        String actualValidationServiceMessage = validationService.validate(user);
        String expectedValidationServiceMessage = UserValidationException.INVALID_FIRSTNAME_ERROR;
        if (expectedValidationServiceMessage.equals(actualValidationServiceMessage)) {
            System.out.println("Long first name test PASSED");
        } else System.out.println("Long first name test FAILED");
    }

}
