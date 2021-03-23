package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, LoginPage.this);
	}
	
	@FindBy(xpath="//h3[text()='Already registered?']")
	WebElement alreadyRegister;
	
	@FindBy(how = How.ID, using ="email")
	WebElement inputEmailForLogin;
	
	@FindBy(how = How.XPATH, using = "//input[@type=\"password\"]")
	WebElement inputPasswordForLogin;
	
	@FindBy(how = How.ID, using ="SubmitLogin")
	WebElement submitLogin;
	
	public String getLoginPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public String getPageSubheadingAlreadyRegistered()
	{
		String title = alreadyRegister.getText();
		return title;
	}
	
	public void setEmailForLogin(String email)
	{
		inputEmailForLogin.sendKeys(email);
	}
	
	public void setPasswordForLogin(String pwd)
	{
		inputPasswordForLogin.sendKeys(pwd);
	}
	
	public void clickSignIn(){
		submitLogin.click();
	}
}
