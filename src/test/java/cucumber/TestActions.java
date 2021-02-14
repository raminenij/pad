package cucumber;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.junit.*;

import org.openqa.selenium.chrome.ChromeDriver;


public class TestActions {

	//public static WebDriver driver = new ChromeDriver();
	public static WebDriver driver;
	public WebElement openBrowser() {
		System.setProperty("webDriver.chrome.driver", System.getProperty("user")+"//Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 return (WebElement) driver;
	}
	
	@After
	public void closeAndExit()
	{
		driver.quit();
	}

	public void navigate(String url)
	{
		
		driver.navigate().to(url);
	}	

public void setText(String controlName, String value)
	{
		
		WebElement element = driver.findElement(By.name(controlName));
		element.click();
		element.sendKeys(value);				
	}
	
	public String getText(String controlName)
	{
		WebElement element = driver.findElement(By.name(controlName));
		
		return element.getAttribute("value");		 		
	}
	
	
}
