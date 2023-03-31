package com.azulcrm.step_definitions;

import com.azulcrm.pages.HomePage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Logout_Stepdefinitions {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    @Given("user clicks to the profile menu")
    public void user_clicks_to_the_profile_menu() {
        homePage.usernameSpan.click();
    }
    @Given("user clicks to the log out")
    public void user_clicks_to_the_log_out() {
        homePage.logoutSpan.click();
    }
    @Then("user lands on the login page")
    public void user_lands_on_the_login_page() {
        Assert.assertEquals("Authorization",Driver.getDriver().getTitle());
    }

    @Given("user goes to main page")
    public void user_goes_to_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPageUrl"));
    }

    @Given("user clicks to the step back button")
    public void user_clicks_to_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @And("user closes tab or tabs")
    public void userClosesTabOrTabs() {
        BrowserUtils.openNewTab();

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        List<String> allOpenTabs = new ArrayList<>(windowHandles);

        //allOpenTabs.size()-1 --> don't close the empty tab
        for (int i = 0; i < allOpenTabs.size()-1; i++) {
            Driver.getDriver().switchTo().window(allOpenTabs.get(i));
            Driver.getDriver().close();
        }
        BrowserUtils.switchToWindow(0);    }
}
