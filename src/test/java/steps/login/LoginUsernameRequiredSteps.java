package steps.login;

import pages.login.LoginUsernameRequiredPage;

public class LoginUsernameRequiredSteps {
    LoginUsernameRequiredPage page = new LoginUsernameRequiredPage();

    public void verifyThatOk(){

        page.assertThatUserNameIsRequired();
    }
}
