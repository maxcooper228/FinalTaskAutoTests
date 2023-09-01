package steps.login;

import pages.login.LoginPasswordRequiredPage;

public class LoginPasswordRequiredSteps {
    LoginPasswordRequiredPage page = new LoginPasswordRequiredPage();

    public void verifyThatOk(){
        page.assertThatPasswordIsRequired();
    }
}
