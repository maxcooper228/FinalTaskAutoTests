package pages.login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;
public class LoginPasswordRequiredPage extends BasePage {
    @FindBy(xpath = "//*[text()='Epic sadface: Password is required']")
    WebElement passwordIsRequired;

    public void assertThatPasswordIsRequired(){
        assertThat(passwordIsRequired.isDisplayed()).isTrue();
    }

}
