package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SearchSteps {
	WebDriver driver = null;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() {
		System.out.println("Step: user opens the browser");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Step: user is on google search page");
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		System.out.println("Step: user enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		Thread.sleep(2000);

	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Step: hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("user is navigated to search reults page")
	public void user_is_navigated_to_search_reults_page() throws InterruptedException {
		System.out.println("Step: user is navigated to search reults page");

		driver.getPageSource().contains("BDD testing");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
