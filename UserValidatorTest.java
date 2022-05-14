package com.bridgelabz.Regex;

public class UserValidatorTest {

	   @Test
	    public void GivenFirstName_WhenProper_ShouldReturnTrue() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateFirstName("Jeeva");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenFirstName_WhenShort_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateFirstName("jeeva");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenFirstName_WhenSpecialChar_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateFirstName("Jeev@a");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenLastName_WhenProper_ShouldReturnTrue() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateLastName("Rathinam");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenLastName_WhenShort_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateLastName("Ra");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenLastName_WhenSpecialChar_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateLastName("Rat@hi@nam");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenPassWord_WhenProper_ShouldReturnTrue() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validatePassWord("Jeevan_123");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPassWord_WhenNotProper_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validatePassWord("Jeeva123");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenEmail_WhenProper_ShouldReturnTrue() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateEmail("jeevasmart123@gmail.com");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenEmail_WhenNotProper_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validateEmail("jeevasmart@123.com");
	        Assert.assertFalse(result);
	    }
	    @Test
	    public void GivenPhoneNum_WhenProper_ShouldReturnTrue() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validatePhoneNum("91 1234567890");
	        Assert.assertTrue(result);
	    }
	    @Test
	    public void GivenPhoneNum_WhenNotProper_ShouldReturnFalse() {
	        UserValidator validator = new UserValidator();
	        boolean result = validator.validatePhoneNum("09 1234567890");
	        Assert.assertFalse(result);
	    }
}
