package tests;

import org.testng.annotations.Test;

import steps.login.LoginSteps;

public class LoginFailedTest extends BaseTest {                                    // Даний клас перевіряє можливість логіну під некорректними кредами,
                                                                                   // після яких не відбувається логін на сторінку веб-магазину
    @Test(dataProvider = "loginDataFailed")
        public void testLoginFailed(String login, String password){
         visit("");
        LoginSteps step1 = new LoginSteps();
        step1.doLoginFailed(login, password);
        step1.verifyThatLoginFailed();

        }
}
