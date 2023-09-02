package tests;

import org.testng.annotations.Test;
import steps.login.LoginSteps;


public class LoginUsernameRequiredTest extends BaseTest {                           // Даний клас перевіряє те що поле логіну є обов'язковим для заповнення
    @Test(dataProvider = "loginUsernameRequired")

    public void testLoginUsernameRequired(String login, String password){
        visit("");
        LoginSteps step1 = new LoginSteps();
        step1.doLogin(login, password);
        step1.verifyThatUserNameIsRequired();
    }

}
