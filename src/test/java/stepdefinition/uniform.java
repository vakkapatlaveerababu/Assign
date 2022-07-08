package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class uniform {
	
	
WebDriver driver;
	
	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
    System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
	    driver = new ChromeDriver();  //open my browser
		
		driver.get("http://uniformm1.upskills.in/admin/");
	}

	
	
	
	@When("User enter invalid credentials")
	public void user_enter_invalid_credentials() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	}

	
	
	
	@When("User click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		{
			driver.quit();
			Thread.sleep(2000);
		}
	}
	
	
	
	
	@Then("validation message appears")
	public void validation_message_appears() {
		

	}


	
	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	  
	}

	
	
	
	@When("click on submit button")
	public void click_on_submit_button()throws InterruptedException { 
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-bar-chart-o fa-fw']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='reports']//ul//li//a[@class='parent'][normalize-space()='Customers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Customers Online']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("input-ip")).sendKeys("103.214.63.143");
		Thread.sleep(1000);
		driver.findElement(By.id("input-customer")).sendKeys("Guest");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-pencil']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-home fa-lg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-sign-out fa-lg']")).click();
		Thread.sleep(1000);
		{
			driver.quit();
		}
		
	}

	
	
	
	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	 
	}

}
