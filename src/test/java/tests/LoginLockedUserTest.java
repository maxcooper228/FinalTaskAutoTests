package tests;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import steps.login.LoginLockedUserSteps;

import java.time.Duration;

public class LoginLockedUserTest extends BaseTest{
    @Test(dataProvider = "loginLockedUser")

    public void testLoginLockedUser(String login, String password){
        visit("");
        LoginLockedUserSteps step = steps.doLoginLockedUser(login, password);
        step.verifyThatOk();

    }

}
