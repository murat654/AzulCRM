package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Stepdefinitions {
    LoginPage loginPage = new LoginPage();

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
        //question todo
        System.out.println("HR user logged in successfully");
        Driver.closeDriver();
    }

    @Then("Marketing user logged in successfully")
    public void marketing_user_logged_in_successfully() {
        //question todo
        System.out.println("Marketing user logged in successfully");
        Driver.closeDriver();
    }

    @Then("Helpdesk user logged in successfully")
    public void helpdesk_user_logged_in_successfully() {
        //question todo
        System.out.println("Helpdesk user logged in successfully");
        Driver.closeDriver();
    }

    @Given("user clicks to the login button")
    public void user_clicks_to_the_login_button() {
        loginPage.loginButton.click();
    }
}
