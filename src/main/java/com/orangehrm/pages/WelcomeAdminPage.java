package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeAdminPage extends Utility {

    By welcomeAdminText = By.xpath("//a[@id='welcome']");

    public void displayWelcomeAdminText(){
        verifyThatElementIsDisplayed(welcomeAdminText);
    }
    public String getWelcomeAdminText(){
        return getTextFromElement(welcomeAdminText);
    }
}
