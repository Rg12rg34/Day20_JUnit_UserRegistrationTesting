package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationFormat userRegistration = new UserRegistrationFormat();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Rahul");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Gupta");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.emailValidation("abc@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.emailValidation("abc..@yahoo.com");
        Assert.assertFalse(result);
    }
    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.numberValidation("10 1234567890");
        Assert.assertTrue(result);
    }
    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.numberValidation("11 08450911888");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLoginValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidation("Asbmsopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLoginValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidation("Asjspnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule2Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidation2("Logaqaaopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginValidation2("addqeghopnm");
    }
}
