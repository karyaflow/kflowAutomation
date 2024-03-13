package testCases;

import commons.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class RunEvaluation extends BaseClass {

    @Test
    public void RunEvaluationTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.continueWithEmail();
        loginPage.enterEmail("saugat.dahal@bitskraft.com");
        loginPage.enterPassword("Hello123!");
        loginPage.clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.urlToBe(loginPage.expectedURL));
        Thread.sleep(5000);

    }
}
