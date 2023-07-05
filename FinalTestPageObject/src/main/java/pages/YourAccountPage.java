package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.WaitTool;

public class YourAccountPage extends BasePage {

    @FindBy(xpath ="//*[@id='content']/h1")
    private static WebElement registrationSuccessfulLabel;

    static {
        PageFactory.initElements(driver, YourAccountPage.class);
    }

    public static void verifySuccessfulRegistration(String expectedValidationMessage){
        WaitTool.waitForElementVisibility(By.xpath("//*[@id='content']/h1"),5);
        String registrationSuccessfulLabelText = registrationSuccessfulLabel.getText();
        Assert.assertEquals(registrationSuccessfulLabelText,expectedValidationMessage);
    }
}
