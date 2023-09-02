package tests;
import org.testng.annotations.Test;
import steps.login.LoginSteps;


public class LoginLockedUserTest extends BaseTest{                         // Даний клас перевіряє можливість логіну під кредами залоченого юзера
    @Test(dataProvider = "loginLockedUser")

    public void testLoginLockedUser(String login, String password){
        visit("");
        LoginSteps step1 = new LoginSteps();
        step1.doLoginFailed(login, password);
        step1.verifyThatUserLocked();
    }

}
