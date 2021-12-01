package org.naic.pages;

import org.naic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "cui-login")
    public WebElement btn_login_on_main_page;
    @FindBy(id = "INT_USERNAME")
    public WebElement userNameInput;
    @FindBy(id = "INT_PASSWORD")
    public WebElement passwordInput;
    @FindBy(id = "INT_LOGIN_BTN")
    public WebElement btn_login;
    @FindBy(id = "INT_MESSAGE_WRAPPER")
    public WebElement errormessage;

}
