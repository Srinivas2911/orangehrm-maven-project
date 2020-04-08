package com.orangehrm.testsuite;

import com.orangehrm.pages.WelcomeAdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    WelcomeAdminPage welcomeAdminPage = new WelcomeAdminPage();

    @Test
    public void UserIsAbleToLoginSuccessfully (){
        homePage.setUsernameField();
        homePage.setPasswordField();
        homePage.clickonLoginBtn();
        welcomeAdminPage.displayWelcomeAdminText();
        String expectedText = "Welcome Admin";
        String actualText = welcomeAdminPage.getWelcomeAdminText();
        Assert.assertEquals(expectedText, actualText);

    }


}
