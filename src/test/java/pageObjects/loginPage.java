package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver driver;
	public loginPage(WebDriver ldriver) {
		driver = ldriver;
		PageFactory.initElements (ldriver, this);
		}
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		txtEmail.sendKeys(uname);
		driver.findElement(By.id("identifierId"));
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
}
	
	