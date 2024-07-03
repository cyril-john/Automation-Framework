package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class LoginPageStepDefs
{
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefs.class);
    private WebDriver driver;
    private Login login;

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Utilities/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown()
    {
        if (driver!=null)
        {
            driver.quit();
        }

    }


    @Given("User is on the Amazon india website")
    public void user_is_on_the_amazon_india_website() {
        driver.get("https://www.amazon.in");
        login = new Login(driver);
    }
    @Given("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        login.clickLogin();
        login.enter_username("cyriljohn21@gmail.com");
        login.clickLogin();
        login.enter_password("mary33##");
        login.clickLogin();
    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        login.clickLogin();
    }
    @Then("User is logged in successfully")
    public void user_is_logged_in_successfully() {
        // Assertions should be inside stepDefs
        Assert.fail();
    }



}
