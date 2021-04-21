package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Test Student 70']")
    public WebElement studentRole;

    @FindBy(xpath = "//span[.='Test Librarian 16']")
    public WebElement librarianRole;

    @FindBy(id="navbarDropdown")
    public WebElement logOutDropdownMenu;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutButton;


    public void loggingOut(){
        logOutDropdownMenu.click();
        logOutButton.click();
    }



}
