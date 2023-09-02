package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement loginField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement button;
    @FindBy(xpath = "//*[text()='Epic sadface: Username and password do not match any user in this service']")
    WebElement LoginFailed;
    @FindBy(xpath = "//*[text()='Epic sadface: Sorry, this user has been locked out.']")
    WebElement UserLocked;
    @FindBy(xpath = "//*[text()='Epic sadface: Password is required']")
    WebElement passwordIsRequired;
    @FindBy(xpath = "//*[text()='Epic sadface: Username is required']")
    WebElement usernameIsRequired;
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    WebElement basketButton;


    public void assertThatUserNameIsRequired() {

        assertThat(usernameIsRequired.isDisplayed()).isTrue();
    }
    public void assertThatPasswordIsRequired(){

        assertThat(passwordIsRequired.isDisplayed()).isTrue();
    }
    public void assertThatUserLocked(){

        assertThat(UserLocked.isDisplayed()).isTrue();
    }

    public void assertThatLoginFailed() {

        assertThat(LoginFailed.isDisplayed()).isTrue();
    }

    public void fillLoginField(String text){
        loginField.clear();
        loginField.sendKeys(text);
    }
    public void fillPasswordField(String text){
        passwordField.clear();
        passwordField.sendKeys(text);
    }
    public void clickButton(){
        button.click();
    }
    public void assertThatCartIsPresented(){

        assertThat(basketButton.isDisplayed()).isTrue();
    }
}
