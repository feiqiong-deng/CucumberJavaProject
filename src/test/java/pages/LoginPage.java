package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	protected WebDriver driver;
	
	private By username_login = By.id("name");
	private By password_login = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not valid Login Page. The current page is"
					+ driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(password_login).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

}
