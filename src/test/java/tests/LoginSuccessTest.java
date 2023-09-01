package tests;

import org.testng.annotations.Test;


public class LoginSuccessTest extends BaseTest {

    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testLoginSuccessStandardUser(String login, String password){
        loginMethod(login, password);
    }

    @Test(dataProvider = "loginDataCorrectProblemUser")
    public void testLoginSuccessProblemUser(String login, String password){
        loginMethod(login, password);
    }
    @Test(dataProvider = "loginDataCorrectGlitchUser")
    public void testLoginSuccessGlitchUser(String login, String password){
        loginMethod(login, password);
    }
}
