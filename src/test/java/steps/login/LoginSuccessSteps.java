package steps.login;

import pages.login.LoginSuccessPage;

public class LoginSuccessSteps {
    LoginSuccessPage page = new LoginSuccessPage();

    public void verifyThatOk(){

        page.assertThatUserDivPresent();
    }
    public LoginSuccessSteps doLogin(String login, String password){
        inputLoginData(login, password);
        return new LoginSuccessSteps();
    }
    private void inputLoginData(String login, String password) {
        page.fillLoginField(login);
        page.fillPasswordField(password);
        page.clickButton();
    }
}
