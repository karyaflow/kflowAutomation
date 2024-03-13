package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By username = By.xpath("//input[@id='Username']");
	By password = By.xpath("//input[@id='Password']");
	By loginBtn = By.xpath("//button[normalize-space()='Login']");
	public By myProfile = By.xpath("//mat-card-title[contains(text(),'My Profile')]");

	public void loginUser(String uName, String pass) {
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}
	
}
