package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {
	
	@FindBy(id = "logout")
	@CacheLookup
	WebElement btn_logout;
	
	WebDriver driver;
	
	public Homepage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
