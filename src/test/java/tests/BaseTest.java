package tests;

import lombok.Getter;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.login.LoginSteps;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseTest {
    @Getter
    static WebDriver driver = null;
    Properties properties;

    @SneakyThrows
    @BeforeClass
    public void beforeClass() {
        properties = new Properties();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("config.properties"))){
            properties.load(reader);
            String driverName = properties.getProperty("driver");
            File file = new File(properties.getProperty("path"));
            System.setProperty(driverName, file.getAbsolutePath());
            if (driverName.contains("chrome")) {
                driver = new ChromeDriver();
            }else if (driverName.contains("firefox")){
                driver = new FirefoxDriver();
            }
            assertThat(driver).isNotNull();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        }

    }
    protected void loginMethod(String login, String password) {
        visit("");
        LoginSteps steps1 = new LoginSteps();
        steps1.doLogin(login, password);
        steps1.verifyThatOk();
    }

    public void visit(String path){
        driver.navigate().to(properties.getProperty("host") + path);
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    @DataProvider(name = "loginDataCorrectStandardUser")
    public Object[][] loginSuccessDataStandard(){
        return new Object[][]{
                {"standard_user", "secret_sauce"}
        };
    }
    @DataProvider(name = "loginDataCorrectProblemUser")
    public Object[][] loginSuccessDataProblem(){
        return new Object[][]{
                {"problem_user", "secret_sauce"}
        };
    }
    @DataProvider(name = "loginDataCorrectGlitchUser")
    public Object[][] loginSuccessDataGlitch(){
        return new Object[][]{
                {"performance_glitch_user", "secret_sauce"}
        };
    }

    @DataProvider(name = "loginDataFailed")
    public Object[][] loginFailedData(){
        return new Object[][]{
        {"1", "secret_sauce"},
        {"null", "1"},
        {"@#$%^", "secret_sauce"}
        };
    }
    @DataProvider(name = "loginUsernameRequired")
    public Object[][] loginUsernameRequiredData(){
        return new Object[][]{
                {"", ""}
        };
    }
    @DataProvider(name = "loginPasswordRequired")
    public Object[][] loginPasswordRequiredData(){
        return new Object[][]{
                {"1", ""},
                {"standard_user", ""},
                {"locked_out_user", ""}
        };
    }
    @DataProvider(name = "loginLockedUser")
    public Object[][] loginLockedUserData(){
        return new Object[][]{
                {"locked_out_user", "secret_sauce"}
        };
    }

}
