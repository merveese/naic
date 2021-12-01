package org.naic.pages;

import org.naic.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "header")
    public WebElement navheader;
    @FindBy(id = "block-megamenu")
    public WebElement navmenu;
    @FindBy(xpath = "//nav[@id='block-megamenu']//li[contains(@class,'menu-item')]/a")
    public List<WebElement> navitems;





}