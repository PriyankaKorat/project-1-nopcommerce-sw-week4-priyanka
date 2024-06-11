package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    public void selectMenu(String menu) {
        //Click on menu link
        homePage.clickOnMenuLink(menu);
    }

    @Test
    public void VerifyPageNavigation() {
        String menuName = "Books";
        selectMenu(menuName);
        // Verify that the page has navigated correctly
        String expectedTitle = "nopCommerce demo store. " + menuName;
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
//        System.out.println(driver.getTitle());
    }

}


