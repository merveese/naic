package org.naic.hometest;

import org.junit.Assert;
import org.junit.Test;
import org.naic.pages.HomePage;
import org.naic.utilities.Config;
import org.naic.utilities.Driver;
import org.naic.utilities.SeleniumUtils;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomeTest {

    HomePage homePage = new HomePage();

    @Test
    public void testHomePage() {
        //go to the home page
        Driver.getDriver().get(Config.getProperty("naicUrl"));
        //wait until navigation header is visible
        SeleniumUtils.waitForVisibility(homePage.navheader,30);
        // verify element with the id of block-megamenu is visible
        Assert.assertTrue("There is no visible element with the id of block-megamenu", homePage.navmenu.isDisplayed());
        //verify there are 7 links
        Assert.assertTrue("There are not 7 links", homePage.navitems.size()==7);
        //verify links have the color-grey-dark class
        boolean check = false;
        List<String> failedLinks = new ArrayList<>();
        for (WebElement link : homePage.navitems) {
            System.out.println(link.getAttribute("href"));
            if (!link.getAttribute("class").contains("color-grey-dark")) {
                check = true;
                failedLinks.add(link.getAttribute("a"));
            }
        }
        if (check) {
            Assert.fail("List of links which not contains color-grey-dark class name" + failedLinks);
        }
    }
}

