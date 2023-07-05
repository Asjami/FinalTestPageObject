package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitTool;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//*[@id='top-links']//li[@class='dropdown']")
    private static WebElement myAccountButton;

    @FindBy(xpath = "//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
    private static WebElement registerButton;

    private static final String dashboardPageURL = "http://shop.pragmatic.bg/";
    static {
        PageFactory.initElements(driver, DashBoardPage.class);
    }
    public static void goToDashboardPage(){
        driver.get(dashboardPageURL);
    }
    public static void clickOnMyAccountButton(){
        WaitTool.waitForElementVisibility(By.xpath("//*[@id='top-links']//li[@class='dropdown']"),3);
        clickOnElement(myAccountButton);
        }

    public static void clickOnRegisterButton(){
        WaitTool.waitForElementVisibility((By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")),5);
        clickOnElement(registerButton);
    }

}
