package testCases;


import commons.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SupportingDocsPage;
import utilities.ExtractSpecificColumn;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class SupportingDocs extends BaseClass {
    @Test
    public void UploadSupportingDocsTest() throws InterruptedException, IOException, NoSuchMethodException {

        LoginPage loginPage = new LoginPage(driver);
        SupportingDocsPage sp = new SupportingDocsPage(driver);

        loginPage.continueWithEmail();
        loginPage.enterEmail("saugat.dahal@bitskraft.com");
        loginPage.enterPassword("Hello123!");
        loginPage.clickContinue();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.urlToBe(loginPage.expectedURL));
        Thread.sleep(5000);

        sp.openProject("rty");
        Thread.sleep(5000);
        sp.clickSuppTab();
        ExtractSpecificColumn esc = new ExtractSpecificColumn();
        List<String> filesPath = esc.ExtractColumn(new Object(){}.getClass().getEnclosingMethod().getName(), 1);
        System.out.println("This method name:: "+ new Object(){}.getClass().getEnclosingMethod().getName());
        for (int i = 0; i< filesPath.size(); i++) {
            System.out.println(filesPath.get(i));
            WebElement sel = driver.findElement(By.xpath("//input[@type='file']"));
            sel.sendKeys(filesPath.get(i));
            Thread.sleep(2000);
            sp.clickUpload();
            Thread.sleep(5000);
        }
    }
}
