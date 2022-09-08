/*
 *purpose=Uc10:User Registration using JUnit
 * @author= sushmitha
 * @since=08-10-2022
 */
package com.bridzelab.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate
{
    /**
     * This method takes First Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Firstname is used for comparing with regex
     */
    public boolean isFirstName(String Firstname)
    {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Firstname);
        return matcher.matches();
    }

    /**
     * This method takes Last Name which starts with Capital letter and has minimum of 3 characters
     *
     * @param Lastname is used for comparing with regex
     */
    public boolean isLastName(String Lastname) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(Lastname);
        return matcher.matches();
    }

    /**
     * This method checks if the entered number is valid or not
     *
     * @param Number takes in the parameter as String representation of number
     * @return it returns a boolean value true if the number is valid
     */
    public boolean isNumber(String Number)
    {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][1-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(Number);
        return matcher.matches();
    }

    /**
     * Method to check if the password is valid or not
     *
     * @param passcode takes in the passcode string as a parameter
     * @return returns boolean true if the password matches the requirement
     */
    public boolean password(String passcode)
    {

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(){}'.,+_-])[a-zA-Z0-9 !@#$%^&*(){}'.,+_-]{8,}");  //
        Matcher matcher = pattern.matcher(passcode);
        return matcher.matches();
    }

    public static void main(String[] args)
    {

        Validate obj = new Validate();
        System.out.println(obj.isFirstName("Sushmitha"));
        System.out.println(obj.isLastName("Akhila"));
        System.out.println(obj.isNumber("1234567890"));
        System.out.println(obj.password("Hyderbad1"));
    }
}