package org.example.pages;

import org.example.locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;

public class Login extends LoginPageLocators
{
    private WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    //locators

    public void enter_username(String username)
    {
        driver.findElement(email_textfield).sendKeys(username);
    }

    public void enter_password(String password)
    {
        driver.findElement(password_textfield).sendKeys(password);
    }
    public void clickLogin()
    {
        driver.findElement(Continue_SignIn_button).click();
    }

    public void checkLoginIsSuccessful()
    {
        System.out.println("PAss");
    }





}
