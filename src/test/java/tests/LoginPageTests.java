package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTests extends TestBase{
	
	@Test
	public void verifyLoginWithInvalidCredentials()
	{
		hp.clickSingIn();
		String expectedTitle = "ALREADY REGISTERED?";
		String actualTitle = lp.getPageSubheadingAlreadyRegistered();
		
		Assert.assertEquals(actualTitle, expectedTitle, "Login Page not found");
		System.out.println("I am on Login Page");
		
		System.out.println("Attempting to sign in with invalid credentials");
		
		lp.setEmailForLogin("dcqadevops@gmail.com");
		lp.setPasswordForLogin("123");
		lp.clickSignIn();
	}

}
