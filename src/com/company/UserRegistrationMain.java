package com.company;


public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistration user = new UserRegistration();

        System.out.println(user.validateFirstName());
        System.out.println(user.validateLastName());
        System.out.println(user.validateMailID());
        System.out.println(user.validateMobileNumber());
        System.out.println(user.validatePassword());
    }
}

