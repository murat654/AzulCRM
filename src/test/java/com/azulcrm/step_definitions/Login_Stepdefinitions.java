package com.azulcrm.step_definitions;

import com.azulcrm.pages.ForgotPasswordPage;
import com.azulcrm.pages.HomePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_Stepdefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPageUrl"));
    }

    @Given("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.usernameInput.sendKeys(username);
    }

    @Given("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("HR user logged in successfully")
    public void hr_user_logged_in_successfully() {
        System.out.println("HR user logged in successfully");
        Assert.assertTrue(homePage.activityStreamSpan.isDisplayed());
    }

    @Then("Marketing user logged in successfully")
    public void marketing_user_logged_in_successfully() {
        System.out.println("Marketing user logged in successfully");
        Assert.assertTrue(homePage.activityStreamSpan.isDisplayed());
    }

    @Then("Helpdesk user logged in successfully")
    public void helpdesk_user_logged_in_successfully() {
        System.out.println("Helpdesk user logged in successfully");
        Assert.assertTrue(homePage.activityStreamSpan.isDisplayed());
    }

    @Given("user clicks to the login button")
    public void user_clicks_to_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user sees Incorrect login or password message")
    public void userSeesIncorrectLoginOrPasswordMessage() {
        String actualMessage = loginPage.errorMessageDisplay.getText();
        String expectedMessage = ConfigurationReader.getProperty("loginErrorMessage");

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("user sees Please fill out this field message")
    public void userSeesPleaseFillOutThisFieldMessage() {
        String actualMessage = loginPage.errorMessageDisplay.getText();
        String expectedMessage = "Please fill out this field";

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Given("user clicks Forgot your password? link")
    public void user_clicks_forgot_your_password_link() {
        loginPage.forgotYourPassLink.click();
    }

    @Then("user lands on the Get Password page")
    public void user_lands_on_the_get_password_page() {
        Assert.assertTrue(forgotPasswordPage.resetPasswordButton.isDisplayed());
    }

    @Then("user sees Remember Me link and is clickable")
    public void userSeesRememberMeLinkAndIsClickable() {
        Assert.assertTrue(loginPage.rememberMeOnThisComputerCheckBox.isDisplayed() && loginPage.rememberMeOnThisComputerCheckBox.isEnabled());
    }

    @Then("user sees the password in bullet signs by default")
    public void userSeesThePasswordInBulletSignsByDefault() {
        String passwordFieldType = loginPage.passwordInput.getAttribute("type");
        Assert.assertEquals("password", passwordFieldType);
    }

    @And("user enters password {string} clicks to the Enter key")
    public void userEntersPasswordClicksToTheEnterKey(String password) {
        loginPage.passwordInput.sendKeys(password, Keys.ENTER);
    }

    @Then("user sees {string} the username in the profile menu")
    public void userSeesTheUsernameInTheProfileMenu(String username) {
        String actual = homePage.usernameSpan.getText();
        Assert.assertEquals(username, actual);
    }
}
