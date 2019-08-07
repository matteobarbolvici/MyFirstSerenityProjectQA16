package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.AccountPage;
import org.fasttrack.pages.HomePage;
import org.fasttrack.pages.LoginPage;

public class AccountPageSteps {

    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
public void navigateMyOrders(){
    homePage.open();
    homePage.clickAccount();
    homePage.clickLoginLink();


    }
}