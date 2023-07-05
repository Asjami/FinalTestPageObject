package pages;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitTool;

public class RegisterAccountPage extends BasePage {
    @FindBy(id = "input-firstname")
    private static WebElement inputFirstNameField;

    @FindBy(id = "input-lastname")
    private static WebElement inputLastNameField;

    @FindBy(id = "input-email")
    private static WebElement inputEmailField;

    @FindBy(id = "input-telephone")
    private static WebElement inputPhoneNumberField;

    @FindBy(id = "input-password")
    private static WebElement inputPasswordField;

    @FindBy(id = "input-confirm")
    private static WebElement inputConfirmPasswordField;

    @FindBy(xpath = "//input[@name='agree']")
    private static WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//input[@type='submit']")
    private static WebElement continueButton;

    static {
        PageFactory.initElements(driver, RegisterAccountPage.class);
    }


    public static void writeInFirstNameField(){
        WaitTool.waitForElementVisibility(By.id("input-firstname"),3);
        String firstName = RandomStringUtils.randomAlphabetic(5);
        inputFirstNameField.sendKeys(firstName);
    }

    public static void writeInLastNameField(){
        String lastName = RandomStringUtils.randomAlphabetic(8);
        inputLastNameField.sendKeys(lastName);
    }

    public static void writeInEmailField(){
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String sufix = RandomStringUtils.randomAlphabetic(5);
        String domain = RandomStringUtils.randomAlphabetic(3);
        String emailAddress = prefix + "@" + sufix + "." + domain;
        inputEmailField.sendKeys(emailAddress);
    }
    public static void writeInPhoneNumberField(){
        String phoneNumber = RandomStringUtils.randomNumeric(8);
        inputPhoneNumberField.sendKeys(phoneNumber);
    }

    public static void writeInPasswordField(){
        inputPasswordField.sendKeys("123456");
    }

    public static void writeInConfirmPasswordField(){
        inputConfirmPasswordField.sendKeys("123456");
    }

    public static void clickOnPrivacyPolicyCheckbox(){
        privacyPolicyCheckbox.click();
    }

    public static void clickOnContinueButton(){
        continueButton.click();
    }





}
