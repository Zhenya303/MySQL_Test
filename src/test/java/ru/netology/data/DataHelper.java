package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;
import java.util.Random;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("en"));
    private DataHelper() {
    }

    public static AuthInfo getAuthInfoWithTetsData() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static String getRandomLogin(){
        return faker.name().username();
    }

    public static String getRandomPassword(){
     return faker.internet().password();
    }

    public static AuthInfo generateRandomUser(){
        return new AuthInfo(getRandomLogin(), getRandomPassword());
    }

    public static VerificationCode generateRandomVerificationCode() {

        return new  VerificationCode(faker.numerify("######"));
    }




    @Value
    public static class VerificationCode {
        String code;
    }

    @Value
    public  static class AuthInfo {
        String login;
        String password;
    }
}
