package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public  WebDriver driver;
		@Given("Go To Practice Home Page")
		public void go_to_practice_home_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\dri\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("No, thanks!")).click();
			}

		@Then("Enter the text in text box")
		public void enter_the_text_in_text_box() {
		driver.findElement(By.id("user-message")).sendKeys("Hello");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
//		driver.findElement(By.id("sum1")).sendKeys("100");
//		driver.findElement(By.id("sum2")).sendKeys("2000");
//		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
//		
		}
		@Then("verify and validate the displyed message")
		
		public void verify_and_validate_the_displyed_message() {
		String ext= "Hello";
		String act= driver.findElement(By.id("display")).getText();
		System.out.println("actual result ="+act);
		Assert.assertEquals(act,ext);
		driver.close();
			}
	
			@Then("Enter the a value and b values")
			public void enter_the_a_value_and_b_values() {
				driver.findElement(By.id("sum1")).sendKeys("100");
				driver.findElement(By.id("sum2")).sendKeys("2000");
			driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();	
			   
			}
			
			@Then("verify and validate the total value")
			public void verify_and_validate_the_total_value() {
			String expected = "2100";
			String actual = driver.findElement(By.id("displayvalue")).getText();
			Assert.assertEquals(expected,actual);
			driver.close();		
			    
			}



}




