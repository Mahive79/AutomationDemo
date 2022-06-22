package stepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import pages.BasePage;

public class Hooks extends BasePage {

    @BeforeAll
    public static void driverSetup() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
}