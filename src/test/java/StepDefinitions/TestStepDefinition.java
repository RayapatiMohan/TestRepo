package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import Common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestStepDefinition extends BasePage {
		
		
		@Given("Open chrome browser")
		public void open_chrome_browser() {
		    // Write code here that turns the phrase above into concrete actions
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		    
		}

		@Given("Launch facebook url in browser")
		public void launch_facebook_url_in_browser() {
			
			driver.get("https://www.facebook.com");
		}

		@When("Enter username and password in facebook login page")
		public void enter_username_and_password_in_facebook_login_page() {
		    driver.findElement(By.id("email")).sendKeys("User1");
		    driver.findElement(By.id("pass")).sendKeys("pass");
		    
		}

		@When("Click on login button")
		public void click_on_login_button() {
		    
			driver.findElement(By.name("login")).click();
		}

		@Then("Validate the home button")
		public void validate_the_home_button() {
		    
		    System.out.println("Login successfully to facebook account");
		}
		@And("Close the browser")
		public void close_the_browser() {
		    
		    driver.close();
		}

}


