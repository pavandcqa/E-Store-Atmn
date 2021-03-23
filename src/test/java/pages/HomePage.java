package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{

	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, HomePage.this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),\"Sign in\")]")
	WebElement singInLink;
	
	
	public boolean getStatusOfSingInLink()
	{
		boolean status = singInLink.isDisplayed();
		return status;
	}
	
	public void clickSingIn()
	{
		singInLink.click();
	}
	
	public String getTitleHomePage()
	{
		String title = driver.getTitle();
		return title;
	}
}
