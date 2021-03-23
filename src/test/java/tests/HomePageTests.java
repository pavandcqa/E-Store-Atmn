package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTests extends TestBase{

	
	@Test(priority = 1)
	public void verifyHomePage() {
		
		System.out.println(" I am on HomePage ..");
		String expctedTitle = "My Store";
		String actualTitle = hp.getTitleHomePage();
		System.out.println("Verifying the HomePage title..");
		Assert.assertEquals(actualTitle, expctedTitle);	
	}
	
	@Test(priority = 2)
	public void verifySignIn()
	{
		
		System.out.println("I am on Home Page");
		Assert.assertTrue(hp.getStatusOfSingInLink(), "Sing In link not present.");
		
		hp.clickSingIn();
		System.out.println("Redirecting to LoginPage");
		
		String expectedTitle = "Login - My Store";
		String actualTitle = lp.getLoginPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Login page not found..");
	}
	
}
