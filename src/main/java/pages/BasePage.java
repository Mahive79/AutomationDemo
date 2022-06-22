package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;
    public static LoginPage loginPage;

    public static void initPages() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }
}