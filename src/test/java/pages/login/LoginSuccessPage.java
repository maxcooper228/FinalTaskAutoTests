package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends BasePage {
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    WebElement basketButton;

    @FindBy(id = "user-name")
    WebElement loginField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement button;

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
    public void assertThatUserDivPresent(){

        assertThat(basketButton.isDisplayed()).isTrue();
    }
}
