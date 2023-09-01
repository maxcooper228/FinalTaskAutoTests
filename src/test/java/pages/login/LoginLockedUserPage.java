package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginLockedUserPage extends BasePage {
    @FindBy(xpath = "//*[text()='Epic sadface: Sorry, this user has been locked out.']")
    WebElement UserLocked;

    public void assertThatUserLocked(){
        assertThat(UserLocked.isDisplayed()).isTrue();
    }
}
