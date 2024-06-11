package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    static String DescOrderText = "Name: Z to A";
    static String AscOrderText = "Name: A to Z";

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Click on Computer Menu.
        //1.2 Click on Desktop
        computerPage.mouseOverToComputerAndClickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A
        computerPage.selectSortByPosition(DescOrderText);
        //1.4 Verify the Product will arrange in Descending order.
        List<String> actualProductNames = computerPage.verifyOrder();
        List<String> expectedProductNames = computerPage.reverseProductOrder(actualProductNames);
        Assert.assertEquals(actualProductNames, expectedProductNames);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        //2.2 Click on Desktop
        computerPage.mouseOverToComputerAndClickOnDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectSortByPosition(AscOrderText);
        Thread.sleep(2000);
        //2.4 Click on "Add To Cart
        computerPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer
        String expectedText = "Build your own computer";
        String actualText = computerPage.verifyText(computerPage.buildText);
        Assert.assertEquals(actualText, expectedText, "Text not displayed");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.selectRam();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]
        computerPage.selectRadio();
        //2.11 Verify the price "$1,475.00"
        expectedText = "$1,475.00";
        actualText = computerPage.verifyText(computerPage.totalPrice);
        Assert.assertEquals(actualText, expectedText, "Price not match");
        //2.12 Click on "ADD TO CARD" Button.
        computerPage.addToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        expectedText = "The product has been added to your shopping cart";
        actualText = computerPage.verifyText(computerPage.confirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        computerPage.clickOnElement(computerPage.closeButton);
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        computerPage.mouseHoverToElementAndClick(computerPage.shoppingCartLink);
        computerPage.clickOnElement(computerPage.goToCartButton);
        //2.15 Verify the shoppingCartMessage "Shopping cart"
        expectedText = "Shopping cart";
        actualText = computerPage.verifyText(computerPage.shoppingCartMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.clickOnElement(computerPage.qtyUp);
        //2.17 Verify the Total"$2,950.00"
        expectedText = "$2,950.00";
        actualText = computerPage.verifyText(computerPage.updatedTotal);
        Assert.assertEquals(actualText, expectedText);
        //2.18 clickOn on checkbox “I agree with the terms of service”
        computerPage.clickOnElement(computerPage.agreeTermsCheckBox);
        //2.19 Click on “CHECKOUT”
        computerPage.clickOnElement(computerPage.checkOutButton);
        //2.20 Verify the Text “Welcome, Please Sign In!”
        expectedText = "Welcome, Please Sign In!";
        actualText = computerPage.verifyText(computerPage.welcomeText);
        Assert.assertEquals(actualText, expectedText, "Welcome text not displayed");
        //2.21 Click on “CHECKOUT AS GUEST” Tab
        computerPage.clickOnCheckoutButton();
        //2.22 Fill the all mandatory field
        sendTextToElement(computerPage.firstName,"Priyanka");
        sendTextToElement(computerPage.lastName,"Korat");
        sendTextToElement(computerPage.email,"sanganipriyanka81@gmail.com");
        sendTextToElement(computerPage.companyAddress,"Prime");
        sendTextToElement(computerPage.country,"Australia");
        sendTextToElement(computerPage.city,"Sydney");
        sendTextToElement(computerPage.address,"Schofield");
        sendTextToElement(computerPage.zipCode,"201514");
        sendTextToElement(computerPage.phoneNum,"0404624564");
        Thread.sleep(2000);
        //2.23 Click on “CONTINUE”
        clickOnElement(computerPage.saveButton);
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(computerPage.nextDatDayAirRadio);
        //2.25 Click on “CONTINUE”
        clickOnElement(computerPage.continueButton);
        Thread.sleep(2000);
        //2.26 Select Radio Button “Credit Card”
        clickOnElement(computerPage.creditCardRadioButton);
        Thread.sleep(2000);
        //2.27 Select “Master card” From Select credit card dropdown
        clickOnElement(computerPage.radioMasterCard);
        //2.28 Fill all the details
        selectByVisibleTextFromDropDown(computerPage.masterCard,"Master card");
        sendTextToElement(computerPage.cardHolderName,"Priyanka korat");
        sendTextToElement(computerPage.CardNumber,"0000 0000 0000 0000");
        selectByVisibleTextFromDropDown(computerPage.monthExpiry,"12");
        selectByVisibleTextFromDropDown(computerPage.yearExpiry,"2027");
        sendTextToElement(computerPage.cardCode,"5623");
        //2.29 Click on “CONTINUE”
        clickOnElement(computerPage.continueButtonOnPayment);
        //2.30 Verify “Payment Method” is “Credit Card”
        expectedText = "Payment Method: Credit Card";
        actualText = computerPage.verifyText(computerPage.paymentMethodText);
        Assert.assertEquals(actualText,expectedText,"Card not selected");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Thread.sleep(2000);
        expectedText = "Shipping Method: Next Day Air";
        actualText = computerPage.verifyText(computerPage.shippingMethodText);
        Assert.assertEquals(actualText,expectedText,"Method not selected");
        //2.33 Verify Total is “$2,950.00”
        expectedText = "$2,950.00";
        actualText = computerPage.verifyText(computerPage.totalPrice2);
        Assert.assertEquals(actualText,expectedText,"Total price not matched");
        //2.34 Click on “CONFIRM”
        clickOnElement(computerPage.confirmButton);
        //2.35 Verify the Text “Thank You”
        expectedText = "Thank you";
        actualText = computerPage.verifyText(computerPage.thankText);
        Assert.assertEquals(actualText,expectedText,"Text not matched");
        //2.36 Verify the message “Your order has been successfully processed!”
        expectedText = "Your order has been successfully processed!";
        actualText = computerPage.verifyText(computerPage.successMessage);
        Assert.assertEquals(actualText,expectedText,"Order not placed successfully");
        //2.37 Click on “CONTINUE”
        clickOnElement(computerPage.continueButton1);
        //2.37 Verify the text “Welcome to our store”
        expectedText = "Welcome to our store";
        actualText = computerPage.verifyText(computerPage.welcomeStoreText);
        Assert.assertEquals(actualText,expectedText,"You are not on homepage");



    }

}
