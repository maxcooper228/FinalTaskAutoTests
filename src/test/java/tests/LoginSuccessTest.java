package tests;

import org.testng.annotations.Test;


public class LoginSuccessTest extends BaseTest {                                          // Даний клас перевіряє можливість логіну під корректними кредами,
                                                                                          // після яких відбувається логін на сторінку веб-магазину

    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testLoginSuccessStandardUser(String login, String password){loginMethod(login, password);}    // Перевірка під кредами стандартного юзера
    @Test(dataProvider = "loginDataCorrectProblemUser")
    public void testLoginSuccessProblemUser(String login, String password){loginMethod(login, password);}     // Перевірка під кредами проблемного юзера
    @Test(dataProvider = "loginDataCorrectGlitchUser")
    public void testLoginSuccessGlitchUser(String login, String password){loginMethod(login, password);}     // Перевірка під кредами глітчного юзера
}
