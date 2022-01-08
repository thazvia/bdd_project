package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	//Element library
	@FindBy(how = How.XPATH,using = "//input[@id='username']") WebElement USERNAME_ELEMENT;	
	@FindBy(how = How.XPATH,using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH,using = "//button[contains(text(), 'Sign in')]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	// methods to interact with elements
	public void enterUserName(String USER_NAME) {
		USERNAME_ELEMENT.sendKeys(USER_NAME);
	}
	
	public void enterPassword(String PASSWORD) {
		PASSWORD_ELEMENT.sendKeys(PASSWORD);
	}
	public void clickSignInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	public String getPageTittle() {
		return driver.getTitle();
	}
	
}
