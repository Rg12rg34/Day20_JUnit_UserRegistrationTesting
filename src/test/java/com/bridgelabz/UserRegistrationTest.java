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
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.emailValidation("abc..@radif.com");
        Assert.assertFalse(result);
    }
    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.numberValidation("10 1111111111");
        Assert.assertTrue(result);
    }
    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.numberValidation("11 121212111");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLoginRule1Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule1Validation("agnnfwqopn");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLoginRule1Values_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginRule1Validation("aqropnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule2Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule2Validation("Logaqaaopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule2Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule2Validation("addqeghopnm");
    }
    @Test
    public void givenRule3Value_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule3Validation("Laoqo1rpnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule3Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule3Validation("aqLawhrpnm");
        Assert.assertFalse(result);
    }
    @Test
    public void givenRule4Values_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginRule4Validation("adqe1aaL@fp");
        Assert.assertTrue(result);
    }
    @Test
    public void givenRule4Values_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.loginRule4Validation("awwfleropnm");
        Assert.assertFalse(result);
    }
}
