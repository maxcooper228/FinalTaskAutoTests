package steps.login;

import pages.login.LoginLockedUserPage;

public class LoginLockedUserSteps {
    LoginLockedUserPage page = new LoginLockedUserPage();

    public void verifyThatOk(){
        page.assertThatUserLocked();
    }
}
