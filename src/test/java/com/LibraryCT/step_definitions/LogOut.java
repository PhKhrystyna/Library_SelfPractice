package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut {

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
    LoginPage loginPage = new LoginPage();

    @Given("Student is logged and see the home page")
    public void studentIsLoggedAndSeeTheHomePage()  {
        loginPage.loginAsStudent();
    }

    @When("the student clicks the dropdown button")
    public void theStudentClicksTheDropdownButton()  {
        loginPage.logOutDropdownMenu.click();

    }

    @And("the student clicks the logout button")
    public void theStudentClicksTheLogoutButton()  {
        loginPage.logOutButton.click();

    }

    @Then("Student see the login page")
    public void student_see_the_login_page()  {
        String expected = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actualTitle);


    }

    @Given("Librarian is logged and see the home page")
    public void librarianIsLoggedAndSeeTheHomePage() {
        loginPage.loginAsLibrarian();

    }

    @When("the librarian clicks the dropdown button")
    public void theLibrarianClicksTheDropdownButton() {
        loginPage.logOutDropdownMenu.click();
    }

    @And("the librarian clicks the logout button")
    public void theLibrarianClicksTheLogoutButton() {
        loginPage.logOutButton.click();
    }

    @Then("Librarian see the login page")
    public void librarian_see_the_login_page() {
        String expected = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expected,actualTitle);
    }
}