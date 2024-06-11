package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Utility {

    //This is foe onther way to click on topmenu link
    By computers = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Computers ')]");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Electronics ')]");
    By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Apparel ')]");
    By digitalDownloads = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Digital downloads ')]");
    By books = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Books ')]");
    By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Jewelry ')]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), 'Gift Cards ')]");

    public void clickOnMenuLink(String menu) {
        By menuLink = generateMenuLink(menu);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        clickOnElement(menuLink);

        //onther way to click on the menu

      /*  if (menu.equalsIgnoreCase("Computers")) {
            clickOnElement(computers);
        } else if (menu.equalsIgnoreCase("Electronics")) {
            clickOnElement(electronics);
        } else if (menu.equalsIgnoreCase("Apparel")) {
            clickOnElement(apparel);
        } else if (menu.equalsIgnoreCase("Digital downloads")) {
            clickOnElement(digitalDownloads);
        } else if (menu.equalsIgnoreCase("Books")) {
            clickOnElement(books);
        } else if (menu.equalsIgnoreCase("Jewelry")) {
            clickOnElement(jewelry);
        } else if (menu.equalsIgnoreCase("Gift Cards")) {
            clickOnElement(giftCards);
        } else {
            System.out.println("link not found");
        }
*/
    }
    public By generateMenuLink(String menu){
        By menuLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(), '" + menu + "')]");
        return menuLink;
    }


}
