package orange.ny.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	WebDriver driver;
	@Given("User is able to open the browser")
	public void user_is_able_to_open_the_browser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	    
	}
	@Given("User is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	
	@When("User is able to enter the user name")
	public void user_is_able_to_enter_the_user_name() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	    
	}
	@When("User is able to enter the password")
	public void user_is_able_to_enter_the_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	@When("User is able to click on the log in is BTN")
	public void user_is_able_to_click_on_the_log_in_is_btn() {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    
	}

}
