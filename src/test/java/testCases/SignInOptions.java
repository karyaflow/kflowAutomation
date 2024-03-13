package testCases;

import commons.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInOptionsPage;

import java.time.Duration;

public class SignInOptions extends BaseClass{
	
	@Test
	public void SignInOptionsTest() {
		
		SignInOptionsPage signInOptionsPage = new SignInOptionsPage(driver);
		
		signInOptionsPage.continueWithEmail();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signInOptionsPage.isLogin()));
		Assert.assertTrue(signInOptionsPage.isLogin().isDisplayed(), "Login page is loaded successfully");
	}

}
