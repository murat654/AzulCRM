package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotYourPassLink;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/div[2]")
    public WebElement errorMessageDisplay;
}
