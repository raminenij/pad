package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class guru {
	public  WebDriver driver;
	
		@Given("go to demo.guru99 page")
		public void go_to_demo_guru99_page() 
			{
			 
				System.setProperty("webdriver.chrome.driver", "C:\\dri\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.guru99.com/alert-popup-handling-selenium.html");
				driver.manage().window().maximize();
			 }	
			@Given("go to alert expample page\"https:\\/\\/www.guru99.com\\/alert-popup-handling-selenium.html\"")
			public void go_to_alert_expample_page_https_www_guru99_com_alert_popup_handling_selenium_html() 
			{
				   
			}
			 
		    
		

		

		@Then("enter customer id and submit for deltete")
		public void enter_customer_id_and_submit_for_deltete() {
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();			
		    
		}
		@And("select ok button on pop up window")
		//void accept alert message
		public void select_ok_button_on_pop_up_window() {
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().accept();
		String act = driver.switchTo().alert().getText();	
		System.out.println(act);
		String exp ="Do you really want to delete this Customer?";
		Assert.assertEquals(act, exp);
		    
		}
		@And("click ok on confirmation")
		public void click_ok_on_confirmation() {
		    
		}



	
	
	

}
