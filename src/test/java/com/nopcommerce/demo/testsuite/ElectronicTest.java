package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends TestBase {
    ElectronicPage electronicPage = new ElectronicPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicPage.mouseHoverToElement(electronicPage.electronicsLink);
        //1.2 Mouse Hover on “Cell phones” and click
        electronicPage.mouseHoverToElementAndClick(electronicPage.cellPhonesLink);
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = electronicPage.getVerificationText(electronicPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicPage.mouseHoverToElement(electronicPage.electronicsLink);
        //2.2 Mouse Hover on “Cell phones” and click
        electronicPage.mouseHoverToElementAndClick(electronicPage.cellPhonesLink);
        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = electronicPage.getVerificationText(electronicPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);
        //2.4 Click on List View Tab
        electronicPage.clickOn(electronicPage.listTab);
        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronicPage.clickOn(electronicPage.nokiaLumia1020);
        //2.6 Verify the text “Nokia Lumia 1020”
        expectedText = "Nokia Lumia 1020";
        actualText = electronicPage.getVerificationText(electronicPage.nokiaLumia1020Text);
        Assert.assertEquals(actualText, expectedText);
        //2.7 Verify the price “$349.00”
        expectedText = "$349.00";
        actualText = electronicPage.getVerificationText(electronicPage.price349);
        Assert.assertEquals(actualText, expectedText);
        //2.8 Change quantity to 2
        electronicPage.clearAndSendText(electronicPage.qtyBox, "2");
        //2.9 Click on “ADD TO CART” tab
        electronicPage.clickOn(electronicPage.addToCartButton);
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        expectedText = "The product has been added to your shopping cart";
        actualText = electronicPage.getVerificationText(electronicPage.confirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        //After that close the bar clicking on the cross button.
        electronicPage.clickOn(electronicPage.closeButton);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicPage.mouseHoverOnElementAndClick(electronicPage.shoppingCartTab);
        electronicPage.clickOn(electronicPage.goToCartButton);
        //2.12 Verify the message "Shopping cart"
        expectedText = "Shopping cart";
        actualText = electronicPage.getVerificationText(electronicPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        //2.13 Verify the quantity is 2
        expectedText = "2";
        actualText = electronicPage.getAttribute(electronicPage.qty);
        Assert.assertEquals(actualText, expectedText);
        //2.14 Verify the Total $698.00
        expectedText = "$698.00";
        actualText = electronicPage.getVerificationText(electronicPage.total698);
        Assert.assertEquals(actualText, expectedText);
        //2.15 click on checkbox “I agree with the terms of service”
        electronicPage.clickOn(electronicPage.agreeTermsCheckBox);
        //2.16 Click on “CHECKOUT”
        electronicPage.clickOn(electronicPage.checkOutButton);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        expectedText = "Welcome, Please Sign In!";
        actualText = electronicPage.getVerificationText(electronicPage.welcomeMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.18 Click on “REGISTER” tab
        electronicPage.clickOn(electronicPage.registerTab);
        //2.19 Verify the text “Register”
        expectedText = "Register";
        actualText = electronicPage.getVerificationText(electronicPage.registerText);
        Assert.assertEquals(actualText, expectedText);
        //2.20 Fill the mandatory fields
        electronicPage.clickOn(electronicPage.selectMaleGender);
        electronicPage.sendText(electronicPage.firstName, "Priyanka");
        electronicPage.sendText(electronicPage.lastName, "Korat");
        electronicPage.sendText(electronicPage.emailId, electronicPage.generateEmailId());
        electronicPage.select(electronicPage.date, "23");
        electronicPage.select(electronicPage.month, "8");
        electronicPage.select(electronicPage.year, "1993");
        electronicPage.sendText(electronicPage.password, "Test@123");
        electronicPage.sendText(electronicPage.confirmPassword, "Test@123");
        //2.21 Click on “REGISTER” Button
        electronicPage.clickOn(electronicPage.registerButton);
        //2.22 Verify the message “Your registration completed”
        expectedText = "Your registration completed";
        actualText = electronicPage.getVerificationText(electronicPage.completeRegistrationText);
        Assert.assertEquals(actualText, expectedText);
        //2.23 Click on “CONTINUE” tab
        electronicPage.clickOn(electronicPage.continueTab);
        //2.24 Verify the text “Shopping card”
        expectedText = "Shopping cart";
        actualText = electronicPage.getVerificationText(electronicPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        //2.25 click on checkbox “I agree with the terms of service”
        electronicPage.clickOn(electronicPage.agreeTermsCheckBox);
        //2.26 Click on “CHECKOUT”
        electronicPage.clickOn(electronicPage.checkOutButton);
        //2.27 Fill the Mandatory fields
        Thread.sleep(2000);
        electronicPage.select(electronicPage.selectCountry, "133");
        electronicPage.sendText(electronicPage.cityName, "Amazpn");
        electronicPage.sendText(electronicPage.address1, "Haunted ");
        electronicPage.sendText(electronicPage.postalCode, "KT20");
        electronicPage.sendText(electronicPage.phoneNumber, "1234567890");
        //2.28 Click on “CONTINUE”
        electronicPage.clickOn(electronicPage.continueButton);
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronicPage.clickOn(electronicPage.radioButton2dayAir);
        //2.30 Click on “CONTINUE”
        electronicPage.clickOn(electronicPage.continueShippingNext);
        //2.31 Select Radio Button “Credit Card”
        electronicPage.clickOn(electronicPage.radioCreditCardButton);
        electronicPage.clickOn(electronicPage.continuePaymentNext);
        //2.32 Select “Visa” From Select credit card dropdown
        electronicPage.select(electronicPage.creditcardOption, "visa");
        //2.33 Fill all the details
        electronicPage.sendText(electronicPage.cardHolderName, "Priyanka Korat");
        electronicPage.sendText(electronicPage.creditCardNumber, "5413330089010640");
        electronicPage.select(electronicPage.expiryYear, "2027");
        electronicPage.sendText(electronicPage.cardCode, "727");
        //2.34 Click on “CONTINUE”
        electronicPage.clickOn(electronicPage.continueToDetailsButton);
        //2.35 Verify “Payment Method” is “Credit Card”
        expectedText = "Credit Card";
        actualText = electronicPage.getVerificationText(electronicPage.paymentMethodText);
        Assert.assertEquals(actualText, expectedText);
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        expectedText = "2nd Day Air";
        actualText = electronicPage.getVerificationText(electronicPage.shippingMethod2Day);
        Assert.assertEquals(actualText, expectedText);
        //2.37 Verify Total is “$698.00”
        expectedText = "$698.00";
        actualText = electronicPage.getVerificationText(electronicPage.finalTotal698);
        Assert.assertEquals(actualText, expectedText);
        //2.38 Click on “CONFIRM”
        electronicPage.clickOn(electronicPage.confirmButton);
        //2.39 Verify the Text “Thank You”
        expectedText = "Thank you";
        actualText = electronicPage.getVerificationText(electronicPage.thankYouText);
        Assert.assertEquals(actualText, expectedText);
        //2.40 Verify the message “Your order has been successfully processed!”
        expectedText = "Your order has been successfully processed!";
        actualText = electronicPage.getVerificationText(electronicPage.orderConfirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.41 Click on “CONTINUE”
        electronicPage.clickOn(electronicPage.continueButtonAfterPayment);
        //2.42 Verify the text “Welcome to our store”
        expectedText = "Welcome to our store";
        actualText = electronicPage.getVerificationText(electronicPage.welcomeToStoreMessage);
        Assert.assertEquals(actualText, expectedText);
        //2.43 Click on “Logout” link
        electronicPage.clickOn(electronicPage.logOut);
        //2.44 Verify the URL is “https://demo.nopcommerce.com/"
        expectedText = "https://demo.nopcommerce.com/";
        actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, expectedText);
    }

}

