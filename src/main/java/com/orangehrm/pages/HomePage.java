package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginPanelText = By.xpath("//div[@id='logInPanelHeading']");
    By usernameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginBtn = By.id("btnLogin");

    public void loginPanelTextisDisplayed(){
    verifyThatElementIsDisplayed(loginPanelText);
    }

    public String getLoginPanelText (){
        return getTextFromElement(loginPanelText);
    }
    public void setUsernameField (){
        sendTextToElement(usernameField, "Admin");
    }

    public void setPasswordField (){
        sendTextToElement(passwordField, "admin123");
    }
    public void clickonLoginBtn(){
        clickOnElement(loginBtn );
    }
}
