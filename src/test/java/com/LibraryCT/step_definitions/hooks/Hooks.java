package com.LibraryCT.step_definitions.hooks;

import com.LibraryCT.pages.LoginPage;
import com.LibraryCT.utilities.ConfigurationReader;
import com.LibraryCT.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LoginPage loginPage = new LoginPage();

     @Before
          public void landingPage (){
         loginPage.LandingPage();
       System.out.println("Before Hooks are in action");

     }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
        }

           Driver.closeDriver();
    }

}
