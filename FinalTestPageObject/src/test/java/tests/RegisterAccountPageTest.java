package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.RegisterAccountPage;
import pages.YourAccountPage;

public class RegisterAccountPageTest extends BaseTest {


    @Test
    public void registerNewAccountTest(){
        DashBoardPage.goToDashboardPage();
        DashBoardPage.clickOnMyAccountButton();
        DashBoardPage.clickOnRegisterButton();
        RegisterAccountPage.writeInFirstNameField();
        RegisterAccountPage.writeInLastNameField();
        RegisterAccountPage.writeInPhoneNumberField();
        RegisterAccountPage.writeInEmailField();
        RegisterAccountPage.writeInPasswordField();
        RegisterAccountPage.writeInConfirmPasswordField();
        RegisterAccountPage.clickOnPrivacyPolicyCheckbox();
        RegisterAccountPage.clickOnContinueButton();
        YourAccountPage.verifySuccessfulRegistration("Your Account Has Been Created!");
    }
}
