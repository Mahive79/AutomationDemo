package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.BasePage;
import utils.ConfigReader;


public class LoginStepDef {
    ConfigReader reader;
    @Given("user is on OrangeHRM home page")
    public void user_is_on_orange_hrm_home_page() {
        reader=new ConfigReader();
        BasePage.initPages();
        BasePage.driver.get(reader.applicationURL());
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        BasePage.loginPage.enterLoginUserName();
        BasePage.loginPage.enterLoginPassword();
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        BasePage.loginPage.clickOnLoginButton();
    }

    @Then("user should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        String actualTitle = BasePage.driver.getTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }

}
