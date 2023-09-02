package tests;
import org.testng.annotations.Test;

import steps.login.LoginSteps;

public class LoginPasswordRequiredTest extends BaseTest {                                   // Даний клас перевіряє  те що після заповнення поля логіна
                                                                                            // поле пароля є обов'язковим для заповнення
    @Test(dataProvider = "loginPasswordRequired")

    public void testLoginPasswordRequired(String login, String password){
        visit("");
        LoginSteps step1 = new LoginSteps();
        step1.doLogin(login, password);
        step1.verifyThatPasswordIsRequired();
    }
}
