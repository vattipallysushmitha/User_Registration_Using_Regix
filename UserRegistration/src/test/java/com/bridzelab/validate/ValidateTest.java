package com.bridzelab.validate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ValidateTest
{
    Validate obj = new Validate();

    @Test
    public void happyFirstName()
    {
        Assertions.assertTrue(obj.isFirstName("Sushmitha"));
    }

    @Test
    public void sadFirstName2()
    {
        Assertions.assertFalse(obj.isFirstName("sushmitha Reddy"));
    }

    @Test
    public void happyLastName()
    {
        Assertions.assertTrue(obj.isLastName("Reddy"));
    }

    @Test
    public void sadLastName()
    {
        Assertions.assertFalse(obj.isLastName("vattipally"));
    }

    @Test
    public void happyNumber()
    {
        Assertions.assertTrue(obj.isNumber("91 1234567890"));
    }

    @Test
    public void sadNumber()
    {
        Assertions.assertFalse(obj.isNumber("0987654321"));
    }

    @Test
    public void happyPassword()
    {
        Assertions.assertTrue(obj.password("A1234dg&"));
    }

    @Test
    public void sadPassword()
    {
        Assertions.assertFalse(obj.password("*&^%$#@!"));
    }

}