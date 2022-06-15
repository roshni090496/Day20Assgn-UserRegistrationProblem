package com.company;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    //Declaration of Regex Patterns for the user entry
    public static final String USER_FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    public static final String USER_LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    public static final String USER_MAIL_ID_REGEX = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static final String USER_MOB_NUM_REGEX = "^[9,1]{2}-[0-9]{10}$";
    public static final String USER_PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
    public Assertion Assert;


    public String validFirstName(String userFirstName) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(USER_FIRST_NAME_REGEX);
            if(userFirstName.isEmpty()) {
                throw new UserRegistrationException("Please Enter a Valid First Name", UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME);
            }

            Matcher matcher = pattern.matcher(userFirstName);
            if(matcher.matches()) {
                return "Happy:User Entry Validated Successfully";
            } else {
                return "Sad:User Entry Validation Failed";
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please Enter a Valid First Name", UserRegistrationException.ExceptionType.INVALID_USER_FIRST_NAME);
        }
    }

    public String validLastName(String userLastName) throws UserRegistrationException{
        try {
            Pattern pattern = Pattern.compile(USER_LAST_NAME_REGEX);

            if(userLastName.isEmpty()) {
                throw new UserRegistrationException("Please Enter a Valid Last Name", UserRegistrationException.ExceptionType.INVALID_USER_LAST_NAME);
            }

            Matcher matcher = pattern.matcher(userLastName);
            if(matcher.matches()) {
                return "Happy:User Entry Validated Successfully";
            } else {
                return "Sad:User Entry Validation Failed";
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please Enter a Valid Last Name", UserRegistrationException.ExceptionType.INVALID_USER_LAST_NAME);
        }
    }

    public String validMailID(String userMailID) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(USER_MAIL_ID_REGEX);
            if(userMailID.isEmpty()) {
                throw new UserRegistrationException("Please Enter a Valid Mail ID", UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID);
            }

            Matcher matcher = pattern.matcher(userMailID);
            if(matcher.matches()) {
                return "Happy:User Entry Validated Successfully";
            } else {
                return "Sad:User Entry Validation Failed";
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please Enter a Valid Mail ID", UserRegistrationException.ExceptionType.INVALID_USER_MAIL_ID);
        }
    }

    public String validMobileNumber(String userMobileNumber) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(USER_MOB_NUM_REGEX);
            if(userMobileNumber.isEmpty()) {
                throw new UserRegistrationException("Please Enter your Valid Mobile Number", UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER);
            }

            Matcher matcher = pattern.matcher(userMobileNumber);
            if(matcher.matches()) {
                return "Happy:User Entry Validated Successfully";
            } else {
                return "Sad:User Entry Validation Failed";
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please Enter your Valid Mobile Number", UserRegistrationException.ExceptionType.INVALID_USER_MOBILE_NUMBER);
        }
    }

    public String validPassword(String userPassword) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(USER_PASSWORD_REGEX);
            if(userPassword.isEmpty()) {
                throw new UserRegistrationException("Please Enter your Valid Password", UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD);
            }

            Matcher matcher = pattern.matcher(userPassword);
            if(matcher.matches()) {
                return "Happy:User Entry Validated Successfully";
            } else {
                return "Sad:User Entry Validation Failed";
            }
        } catch(Exception e) {
            throw new UserRegistrationException("Please Enter your Valid Password", UserRegistrationException.ExceptionType.INVALID_USER_PASSWORD);
        }
    }
}
