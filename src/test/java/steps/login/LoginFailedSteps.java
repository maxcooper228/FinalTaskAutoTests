package steps.login;

import pages.login.LoginFailedPage;

public class LoginFailedSteps {
    LoginFailedPage page = new LoginFailedPage();

    public void verifyThatOk(){
        page.assertThatLoginFailed();
    }
}
