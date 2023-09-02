package steps.login;


import pages.login.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();


    public LoginSteps doLogin(String login, String password){
        inputLoginData(login, password);
        return new LoginSteps();
    }
    public LoginSteps doLoginFailed(String login, String password){
        inputLoginData(login, password);
        return new LoginSteps();
    }
    private void inputLoginData(String login, String password) {
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
    }
    public void verifyThatOk(){

        loginPage.assertThatCartIsPresented();
    }
    public void verifyThatLoginFailed(){
        loginPage.assertThatLoginFailed();
    }
    public void verifyThatUserLocked(){
        loginPage.assertThatUserLocked();
    }
    public void verifyThatPasswordIsRequired(){

        loginPage.assertThatPasswordIsRequired();
    }
    public void verifyThatUserNameIsRequired(){
        loginPage.assertThatUserNameIsRequired();
    }
}
