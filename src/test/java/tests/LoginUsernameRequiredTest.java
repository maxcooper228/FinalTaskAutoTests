package tests;

import org.testng.annotations.Test;
import steps.login.LoginUsernameRequiredSteps;

public class LoginUsernameRequiredTest extends BaseTest {
    @Test(dataProvider = "loginUsernameRequired")

    public void testLoginUsernameRequired(String login, String password){
        visit("");
        LoginUsernameRequiredSteps step = steps.doLoginUsername(login, password);
        step.verifyThatOk();
    }

}
