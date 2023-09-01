package tests;

import org.testng.annotations.Test;
import steps.login.LoginFailedSteps;

public class LoginFailedTest extends BaseTest {
    @Test(dataProvider = "loginDataFailed")
        public void testLoginFailed(String login, String password){
         visit("");
         LoginFailedSteps step = steps.doLoginFailed(login, password);
         step.verifyThatOk();

        }
}
