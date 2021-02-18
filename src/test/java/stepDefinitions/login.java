package stepDefinitions;

import cucumber.TestActions;
import io.cucumber.java.en.*;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




@SuppressWarnings("unused")
public class login {
	public  WebDriver driver;
	//public TestActions ta; 
	
	@Given("user on the Login Page {string}")
	public void user_on_the_login_page(String url) {
		
		//public  WebDriver driver;
//		System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
//		 driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\dri\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//ta.openBrowser();
		//WebDriver driver= new ChromeDriver();
			 driver.get(url);
			 driver.manage().window().maximize();
			 	
	}
			
	@Given("user enters email address with {string}")
	public void user_enters_email_address_with(String email) {
		driver.findElement(By.id("Email")).clear();
				
		//driver.findElement(By.id("Email")).sendKeys(email);
		//driver.findElement(By.name("Email")).sendKeys(email);
	
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		
	}

	@Given("user enters password with {string}")
	public void user_enters_password_with(String pass) {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pass);
	}
	
	@Given("user click {string} button")
	public void user_click_button(String string) {
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Then("user should see {string}")
	public void user_should_see(String exp) {
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(exp);
		Assert.assertEquals(exp,title);
			}
	
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

	@When("user logs with user {string} and password {string}")
	public void user_logs_with_user_and_password(String user, String pass) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(user);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
	@Then("selects customers link from home page")
	public void selects_customers_link_from_home_page(){
		driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/ul/li[4]/a/span")).click();
		driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//html/body/div[3]/div[3]/div/form[1]/div[1]/div/a")).click();
		
		
	   	driver.findElement(By.name("Email")).sendKeys("ss23@gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("trhth@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control text-box single-line password']"));
				
		driver.findElement(By.id("Password")).sendKeys("Johnab99");
		driver.findElement(By.id("FirstName")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Abraham");
		
		driver.findElement(By.id("Gender_Male")).click();
		
		driver.findElement(By.id("DateOfBirth")).sendKeys("12/2/1999");
		driver.findElement(By.id("DateOfBirth")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Company")).sendKeys("AZ Software Inc");
		driver.findElement(By.id("IsTaxExempt")).click();
		
		driver.findElement(By.xpath("//input[@class='k-input k-readonly']")).sendKeys("Automation News Letter");
		driver.findElement(By.xpath("//span[@title='delete']")).click();
		driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/form[1]/div[3]/div[1]/nop-panels[1]/nop-panel[1]/div[1]/div[2]/div[1]/div[10]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Guests");
		//Implicit wait
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//li[contains(text(),'Guests')]")).click();
		//Explicit wait
		driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/form[1]/div[3]/div[1]/nop-panels[1]/nop-panel[1]/div[1]/div[2]/div[1]/div[10]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Forum Moderators");
       WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Forum Moderators')]")));
		driver.findElement(By.xpath("//li[contains(text(),'Forum Moderators')]")).click();
		
		//Explicit wait
		
		driver.findElement(By.xpath("//body/div[3]/div[3]/div[1]/form[1]/div[3]/div[1]/nop-panels[1]/nop-panel[1]/div[1]/div[2]/div[1]/div[10]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Vendors");
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Vendors')]")));
		
		
		driver.findElement(By.xpath("//li[contains(text(),'Vendors')]")).click();
				
	}
		

	@Then("enetrs the all fileds in the new form and save")
	public void enetrs_the_all_fileds_in_the_new_form_and_save() {
		driver.findElement(By.id("Password")).sendKeys("newcust@gmail.com");
	}

	
}