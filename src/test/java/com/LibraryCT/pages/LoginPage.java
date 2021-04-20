package com.LibraryCT.pages;

import com.LibraryCT.utilities.ConfigurationReader;
import com.LibraryCT.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail" )
    public WebElement emailField;

    @FindBy(id = "inputPassword")
    public WebElement passwordField;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInbutton;


    public void LandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String expectedTab = "Login - Library";
        String actualTab = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTab, actualTab);
    }

    public void loginAsStudent(){

        emailField.sendKeys(ConfigurationReader.getProperty("emailStudent"));
        passwordField.sendKeys(ConfigurationReader.getProperty("passwordStudent"));
        signInbutton.click();


    }


    public void loginAsLibrarian(){

        emailField.sendKeys(ConfigurationReader.getProperty("emailLibrarian"));
        passwordField.sendKeys(ConfigurationReader.getProperty("passwordLibrarian"));
        signInbutton.click();

    }





}
