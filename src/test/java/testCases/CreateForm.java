package testCases;

import commons.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class CreateForm extends BaseClass {

    String username = "saugat.dahal";
    String password = "Hello123!";

    @Test
    public void CreateFormTest() {
        LoginPage lp = new LoginPage(driver);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.presenceOfElementLocated(lp.username));
        lp.loginUser(username,password);
        wait1.until(ExpectedConditions.presenceOfElementLocated(lp.myProfile));
    }

}
