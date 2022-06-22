package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement loginTextField;

    @FindBy(id = "txtPassword")
    WebElement passwordTextField;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
    WebElement forgotPassword;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterLoginUserName() {
        loginTextField.sendKeys("admin");
    }

    public void enterLoginPassword() {
        passwordTextField.sendKeys("admin123");
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void clickOnForgotPasswordLink() {
        forgotPassword.click();
    }
}