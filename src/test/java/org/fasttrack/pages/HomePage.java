package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = "a[href*='customer/account'] .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "#newsletter-validate-detail > div > div.actions > button")
    private WebElement subscribeButton;

    @FindBy(id = "advice-required-entry-newsletter")
    public WebElement invalidNewsletterEntryErrMsg;

    @FindBy(xpath = "//span[contains(text(),'Thank you for your subscription.')]")
    private WebElement successfulSubscription;

    @FindBy(id = "newsletter")
    private WebElement newsletterInputField;

  //  @FindBy(css = "#advice-required-entry-newsletter")
  //  private WebElement

    public void clickAccount() {
        clickOn(accountLink);
    }

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public void SubscribeButton() {
        clickOn(subscribeButton);
    }

    public void successfulSubscription(){
        Assert.assertTrue("Successful Subscription message is not displayed",successfulSubscription.isDisplayed());
    }


    public void typeNewsletterEmail(){
        newsletterInputField.click();
        newsletterInputField.sendKeys("matteozaffglau_ro@yahoo.com");
    }

}

