/*
*purpose=As a User need to enter a valid First Name
*        - First name starts with Cap and has minimum 3 characters
* @author= sushmitha
* @since=07-10-2022
*/

package com.bridzelab.userregistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    // method to check username Valid or Invalid
    public static boolean isFirstName(String firstname)
    {
        String  regex = "^[A-Z]{1}[a-z]{2,}";           // regex pattern for username

        // the pattern is created using the Pattern.compile() method
        Pattern patt = Pattern.compile(regex);

        if (firstname == null)
        {
            return false;
        }
        // The matcher() method is used to search for the pattern in a string.
        Matcher match = patt.matcher(firstname);

        return match.matches();
    }

    public static void main(String[] args)
    {
        System.out.println("We;come To user Registration Program");

        // Scanner class for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter firstname:");
        String firstname = input.nextLine();
        if (isFirstName(firstname) == true)
        {
            System.out.println("Given Firstname is Correct");
        }
        else
        {
            System.out.println("Given Firstname is Incorrect");
        }
    }

}

