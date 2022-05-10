package stepsForHooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HooksSteps {
	
	WebDriver driver;
	
	@Before(order = 0)
	public void browserSetup() {
		System.out.println("This is in the browser setup.");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Before(order = 1)
	public void testSetupOrder() {
		System.out.println("This is in the setup order 1");
	}
	
	@After(order = 0)
	public void teardown() {
		System.out.println("This is in the teardown.");

		driver.close();
		driver.quit();
	}
	
	@After(order = 1)
	public void testTeardownOrder() {
		System.out.println("This is in the teardown order 1");
	}
	
	@Given("user is on page for login")
	public void user_is_on_page_for_login() {
	   
	}

	@When("user enters name and pass")
	public void user_enters_name_and_pass() {
	   
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	   
	}

	@Then("user is navigated to the main page")
	public void user_is_navigated_to_the_main_page() {
	    
	}

}
