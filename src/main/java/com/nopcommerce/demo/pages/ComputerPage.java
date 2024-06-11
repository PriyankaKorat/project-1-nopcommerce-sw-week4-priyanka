package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Computers ')]");
    By desktop = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By sortByPosition = By.id("products-orderby");
    By productName = By.xpath("//h2[@class = 'product-title']/a");
    By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    public By buildText = By.xpath("//h1[text()='Build your own computer']");
    By processor = By.cssSelector("#product_attribute_1");
    By ram = By.cssSelector("#product_attribute_2");
    By hddRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By osRadio = By.xpath("//input[@id = 'product_attribute_4_9']");
    By totalCommander = By.id("product_attribute_5_12");
    public By totalPrice = By.id("price-value-1");
    By addToCartButton = By.cssSelector("#add-to-cart-button-1");
    public By confirmationMessage = By.xpath("//p[@class='content']");
    public By closeButton = By.xpath("//span[@class='close']");
    public By shoppingCartLink = By.xpath("//span[@class='cart-label']");
    public By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");
    public By shoppingCartMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public By qtyUp = By.xpath("//div[@class='quantity up']");
    public By updatedTotal = By.xpath("//span[@class='product-subtotal']");
    public By agreeTermsCheckBox = By.id("termsofservice");
    public By checkOutButton = By.id("checkout");
    public By welcomeText = By.xpath("//h1");
    public By checkoutButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public By firstName = By.id("BillingNewAddress_FirstName");
    public By lastName = By.id("BillingNewAddress_LastName");
    public By email = By.id("BillingNewAddress_Email");
    public By companyAddress = By.id("BillingNewAddress_Company");
    public By country = By.id("BillingNewAddress_CountryId");
    public By city = By.id("BillingNewAddress_City");
    public By address = By.id("BillingNewAddress_Address1");
    public By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    public By phoneNum = By.id("BillingNewAddress_PhoneNumber");
    public By saveButton = By.name("save");
    public By nextDatDayAirRadio = By.xpath("//label[normalize-space()='Next Day Air ($0.00)']");
    public By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public By creditCardRadioButton = By.id("paymentmethod_1");
    public By radioMasterCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public By masterCard = By.id("CreditCardType");
    public By cardHolderName = By.id("CardholderName");
    public By CardNumber = By.id("CardNumber");
    public By monthExpiry = By.id("ExpireMonth");
    public By yearExpiry = By.id("ExpireYear");
    public By cardCode = By.id("CardCode");
    public By continueButtonOnPayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public By paymentMethodText = By.xpath("//li[@class='payment-method']");
    public By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    public By totalPrice2 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    public By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    public By thankText = By.xpath("//h1[normalize-space()='Thank you']");
    public By successMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    public By continueButton1 = By.xpath("//button[normalize-space()='Continue']");
    public By welcomeStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void mouseOverToComputerAndClickOnDesktop() {
        mouseHoverToElement(computer);
        mouseHoverToElementAndClick(desktop);
    }

    public void selectSortByPosition(String orderText) {
        selectByContainsTextFromDropDown(sortByPosition, orderText);

    }

    public List<String> verifyOrder() {
        List<String> actualProductNames = new ArrayList<>();
        for (WebElement product : ListOfWebElements(productName)) {
            actualProductNames.add(product.getText());
        }
        System.out.println(actualProductNames);
        return actualProductNames;
    }

    public List<String> reverseProductOrder(List<String> actualProductNames) {
        List<String> expectedProducts = new ArrayList<>(actualProductNames);
        expectedProducts.sort(Collections.reverseOrder());
        actualProductNames.sort(Collections.reverseOrder());
        return expectedProducts;
    }

    public void clickOnAddToCart() {

        clickOnElement(addToCart);

    }

    public String verifyText(By by) throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(by);
    }

    public void selectProcessor() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRam() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");

    }

    public void selectRadio() throws InterruptedException {
        clickOnElement(hddRadio);
        Thread.sleep(1000);
        clickOnElement(osRadio);
        Thread.sleep(1000);
        clickOnElement(totalCommander);
    }

    public void addToCartButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(addToCartButton);
    }

    public void clickOnCheckoutButton() throws InterruptedException {
        clickOnElement(checkoutButton);
        Thread.sleep(2000);
    }


}
