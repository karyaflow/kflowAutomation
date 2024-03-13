package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RunEvaluationPage {
    WebDriver driver;
    public RunEvaluationPage (WebDriver driver) {
        this.driver = driver;
    }

    By evalTab = By.xpath("//button[normalize-space()='Evaluations']");
    By runEvalBtn = By.xpath("//button[normalize-space()='Run Evaluations']");




}
