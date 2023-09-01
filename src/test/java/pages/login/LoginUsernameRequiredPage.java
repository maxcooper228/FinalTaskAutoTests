package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginUsernameRequiredPage extends BasePage {
    //@FindBy(xpath = "//*[@id='login_button_container']/div/form/div[3]/h3")
      @FindBy(xpath = "//*[text()='Epic sadface: Username is required']")
    WebElement usernameIsRequired;


    public void assertThatUserNameIsRequired() {
        assertThat(usernameIsRequired.isDisplayed()).isTrue();
    }
}

