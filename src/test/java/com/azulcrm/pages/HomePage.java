package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Activity Stream']/span[1]")
    public WebElement activityStreamSpan;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement usernameSpan;
}
