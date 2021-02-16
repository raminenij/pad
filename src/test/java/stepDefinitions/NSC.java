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



public class NSC {
	public  WebDriver driver;
	
		@Given("go to National Student Clearinghouse Home page")
		public void go_to_national_student_clearinghouse_home_page() {
			System.setProperty("webdriver.chrome.driver", "C:\\dri\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//driver.manage().timeouts().SetScriptTimeout(TimeSpan.FromSeconds(4));
			driver.get("https://www.studentclearinghouse.org/students/");
			driver.manage().window().maximize();
				    
		}
		
		@Then("click on Students dropdown menu")
		public void click_on_students_dropdown_menu() {
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
        }  
                 	
        @Then("click on Order a transcript")
		public void click_order_a_transcript() {
        driver.findElement(By.id("order-a-transcript")).click();
        }     	
        	
        @And("select a college")		
		public void select_a_college() throws Exception {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
               	
        		
        	Thread.sleep(1000);
        	
       // driver.findElement(By.xpath("//input[@id='nsc-form-field-autocomplete']")).sendKeys("Galen College of Nursing");
        driver.findElement(By.xpath("//*[@id='nsc-form-field-autocomplete']")).sendKeys("Galen College of Nursing");
        driver.findElement(By.xpath("//*[@id='nsc-form-field-autocomplete']")).sendKeys(Keys.TAB);
       
        Actions act =new Actions(driver);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.RETURN).build().perform();
       
        }  
        
             

		@Then("click on Order Transcript\\(s)")
		public void click_on_order_transcript_s() throws Exception {
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@id='ordertranscript_button']")).click();
        }
		@Then("enter Personal Information")
        public void enter_personal_information() {
		driver.findElement(By.id("firstNameField")).sendKeys("ggaa");
		driver.findElement(By.id("nameLast_field")).sendKeys("sstt");
		driver.findElement(By.id("dob_field")).sendKeys("02/02/1999");
		driver.findElement(By.id("nameChanged_field_no")).click();
		driver.findElement(By.id("req_identification_ssn_primary")).sendKeys("634721234");
		driver.findElement(By.id("req_identification_ssn_confirm")).sendKeys("634721234");
		driver.findElement(By.id("enrolledCurrently_field_yes")).click();
		driver.findElement(By.xpath("//button[@id='identification_continue']")).click();
		
		
		
           
        }

		}



