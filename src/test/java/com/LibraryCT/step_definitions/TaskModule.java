package com.LibraryCT.step_definitions;

import com.LibraryCT.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskModule {
    LoginPage loginPage = new LoginPage();

    @Given("the student on the home page")
    public void the_student_on_the_home_page() {
        loginPage.loginAsStudent();

    }
    @Then("the student should see following modules")
    public void the_student_should_see_following_modules(List<String> expectedTaskModuleText) {
        Assert.assertEquals(expectedTaskModuleText,loginPage.taskModule());
    }

    @Given("the librarian on the homepage")
    public void theLibrarianOnTheHomepage() {
        loginPage.loginAsLibrarian();
    }

    @Then("the user should see following modules")
    public void theUserShouldSeeFollowingModules(List<String> expectedTaskModuleText) {
        Assert.assertEquals(expectedTaskModuleText,loginPage.taskModule());
    }




}
