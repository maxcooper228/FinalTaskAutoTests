package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginFailedPage extends BasePage {
    @FindBy(xpath = "//*[text()='Epic sadface: Username and password do not match any user in this service']")
    WebElement LoginFailed;

    public void assertThatLoginFailed() {
        assertThat(LoginFailed.isDisplayed()).isTrue();
    }
}
