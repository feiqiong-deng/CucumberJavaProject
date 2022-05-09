package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id = "name")
	@CacheLookup
	WebElement username;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement password;

	@FindBy(id = "login")
	@CacheLookup
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void click() {
		btn_login.click();
	}
}
