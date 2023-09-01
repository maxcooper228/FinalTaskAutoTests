package tests;
import org.testng.annotations.Test;
import steps.login.LoginPasswordRequiredSteps;

public class LoginPasswordRequiredTest extends BaseTest {
    @Test(dataProvider = "loginPasswordRequired")

    public void testLoginPasswordRequired(String login, String password){
        visit("");
        LoginPasswordRequiredSteps step = steps.doLoginPassword(login, password);
        step.verifyThatOk();
    }
}
