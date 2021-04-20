package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    LoginPage loginPage = new LoginPage();


    @Given("student is on login page")
    public void studentIsOnLoginPage() {
        loginPage.LandingPage();
    }

    @When("student logging in with valid credentials")
    public void studentLoggingInWithValidCredentials() {
        loginPage.loginAsStudent();
    }

    @Then("student can see {string} page")
    public void studentCanSeePage(String expectedResult) {

        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        expectedResult="books";
        webDriverWait.until(ExpectedConditions.urlContains(expectedResult));
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Given("librarian is on login page")
    public void librarianIsOnLoginPage() {
        loginPage.LandingPage();
    }

    @When("librarian logging in with valid credentials")
    public void librarianLoggingInWithValidCredentials() {
        loginPage.loginAsLibrarian();
    }

    @Then("librarian can see {string} page")
    public void librarianCanSeePage(String expectedResult) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        expectedResult="dashboard";
        webDriverWait.until(ExpectedConditions.urlContains(expectedResult));
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
