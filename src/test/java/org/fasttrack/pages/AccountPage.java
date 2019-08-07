package org.fasttrack.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://fasttrackit.org/selenium-test/customer/account/")
public class AccountPage extends PageObject {

    @FindBy(css =".hello strong")
    private WebElementFacade helloText;

    public boolean isLoggedIn(String userName){
        return helloText.containsOnlyText("Hello, " + userName+"!");
    }

    @FindBy(xpath = "//span[contains(text(),'My Orders.')]")
    private WebElement clickOnMyOrders;
}

Public void clickOnMyOrders(){
        clickOn(myOrders);



