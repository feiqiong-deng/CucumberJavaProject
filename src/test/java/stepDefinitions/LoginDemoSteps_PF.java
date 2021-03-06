package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.Homepage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	Homepage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Step: browser is open");
		System.out.println("This is in the LoginDemoSteps of Page Factory.");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		System.out.println("Step: user is on the login page");

		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Step: user enters valid username and password");
		
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);

//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Step: user clicks on login button");

		login.click();
//		driver.findElement(By.id("login")).click();

	}

	@Then("user is navigated to the next page")
	public void user_is_navigated_to_the_next_page() throws InterruptedException {
		System.out.println("Step: user is navigated to the next page");

		home = new Homepage_PF(driver);
		home.checkLogoutIsDisplayed();
//		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}

}
