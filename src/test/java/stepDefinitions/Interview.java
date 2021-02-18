
package stepDefinitions;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Interview {
	
	public WebDriver driver;
       @Given("user navigate to upload the page")
		public void user_navigate_to_upload_the_page() 
       {
    	  
    	   System.setProperty("webdriver.chrome.driver", "C:\\dri\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.manage().timeouts().SetScriptTimeout(TimeSpan.FromSeconds(4));
			driver.get("http://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();
    	  	    
		}
        @Then("Click on choose file")
		public void click_on_choose_file() {
		driver.findElement(By.id("uploadfile_0")).click();
		
		 driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\newhtml.html");
		}

		
		@And("Select the image")
		public void select_the_image() {
		
		driver.findElement(By.xpath("//input[@id='uploadfile_0']")).sendKeys("C:\\Users\\padma\\Pictures");
		}
		@Then("Open the image and click accept")
		public void open_the_image_and_click_accept() {
			  driver.findElement(By.id("terms")).click();
		}
		@Then("upload file")
		public void submit_file() {
			driver.findElement(By.id("submitbutton")).click();
		    
		}




}
