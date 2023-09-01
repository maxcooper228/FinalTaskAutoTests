package steps.login;

import pages.login.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    public LoginSuccessSteps doLogin(String login, String password){
        inputLoginData(login, password);
        return new LoginSuccessSteps();
    }
    public LoginFailedSteps doLoginFailed(String login, String password){
        inputLoginData(login, password);
        return new LoginFailedSteps();
    }

    public LoginUsernameRequiredSteps doLoginUsername(String login, String password){
        inputLoginData(login, password);
        return new LoginUsernameRequiredSteps();
    }
    public LoginPasswordRequiredSteps doLoginPassword(String login, String password){
        inputLoginData(login, password);
        return new LoginPasswordRequiredSteps();
    }
    public LoginLockedUserSteps doLoginLockedUser(String login, String password){
        inputLoginData(login, password);
        return new LoginLockedUserSteps();
    }


    private void inputLoginData(String login, String password) {
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
    }
}
