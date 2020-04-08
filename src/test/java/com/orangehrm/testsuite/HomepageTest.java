package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyThatLoginPanelTextisDisplayed(){
        homePage.loginPanelTextisDisplayed();
        String expectedText = "LOGIN Panel";
        String actualText = homePage.getLoginPanelText();
        Assert.assertEquals(expectedText, actualText);
    }

}
