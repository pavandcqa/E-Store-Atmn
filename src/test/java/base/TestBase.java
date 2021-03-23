package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.HomePage;
import pages.LoginPage;

public class TestBase {
	
	protected WebDriver driver;
	protected HomePage hp;
	protected LoginPage lp;
	
	@BeforeTest
	public void setUp()
	{
			System.out.println("==> Setting up browser path");
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			System.out.println("==> Initalizing browser..");
			driver = new ChromeDriver();
			
			System.out.println("redirecting to the applicaiton");
			driver.get("http://automationpractice.com/index.php");
			
			System.out.println("Maximizing the browser..");
			driver.manage().window().maximize();
			
			System.out.println("Clearing browser cookies..");
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			hp = new HomePage(driver);
			lp = new LoginPage(driver);
			
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("killing the browser..");
		driver.quit();
	}

}
