package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestLogin_stepdefinition {
	
	
	 WebDriver driver;
	
	 @Before
	    public void setup() {
	        driver = new FirefoxDriver();
	}
		
	@Given("^I open gcrit login$")
	public void i_open_gcrit_login() throws Exception{
		//Set implicit wait of 10 seconds and launch google
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gcrit.com/build3/login");
	}
	
	@When("^I enter email address and password$")
	public void i_enter_email_address_and_password()throws Exception {
		//enter email and password
		Thread.sleep(2000);
		driver.findElement(By.name("email_address")).sendKeys("tommy123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hesse");
		//Click on Loginbutton
		
		driver.findElement(By.id("tdb5")).click();
	}
	
	@Then("^I should get result that the page source contains the name of customer$")
	public void I_should_get_correct_result() throws Exception {
		
				
		//Verify that result of 2+2 is 4
		Assert.assertEquals(driver.getPageSource().contains("raj!"), true);
		
		driver.close();
	}
	
	 @After
	    public void closeBrowser() {
	        driver.quit();
	 }

}


