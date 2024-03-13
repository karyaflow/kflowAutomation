package pages;

import commons.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInOptionsPage extends BaseClass{
	
	WebDriver driver;
	
	public SignInOptionsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By conWithEmail = By.xpath("//button[normalize-space()='Continue with Email']");
	By isLoginPage = By.xpath("//button[normalize-space()='Back to options']");
	
	public void continueWithEmail() {
		driver.findElement(conWithEmail).click();
	}
	
	public WebElement isLogin() {
		return driver.findElement(isLoginPage);
	}
	
}
