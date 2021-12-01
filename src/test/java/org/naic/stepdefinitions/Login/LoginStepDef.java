package org.naic.stepdefinitions.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.naic.pages.LoginPage;
import org.naic.utilities.Config;
import org.naic.utilities.Driver;
import org.naic.utilities.SeleniumUtils;


public class LoginStepDef {

    LoginPage loginPage= new LoginPage();

    @Given("user navigates to login screen")
    public void user_navigates_to_login_screen() {
        Driver.getDriver().get(Config.getProperty("eappsUrl"));
        loginPage.btn_login_on_main_page.click();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String userName, String password) {
       loginPage.userNameInput.sendKeys(userName);
       loginPage.passwordInput.sendKeys(password);
    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.btn_login.click();
    }

    @Then("user gets error message {string}")
    public void user_gets_error_message(String errorMessage) {
        SeleniumUtils.waitForVisibility(loginPage.errormessage, 50);
        Assert.assertTrue("Error message is not displayed", loginPage.errormessage.isDisplayed());
        Assert.assertTrue("Wrong error message", loginPage.errormessage.getText().equalsIgnoreCase(errorMessage));
    }

}
