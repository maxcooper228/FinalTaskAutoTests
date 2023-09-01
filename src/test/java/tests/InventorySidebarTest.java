package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.inventory.InventorySidebarSteps;
import steps.inventory.InventorySteps;
import steps.login.LoginSuccessSteps;

import java.time.Duration;

public class InventorySidebarTest extends BaseTest {


    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarStandardUser(String login, String password){
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        InventorySidebarSteps steps2 = inventorySteps.doClickSidebar();
        steps2.verifyThatOk();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarClosesStandardUser(String login, String password){
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        InventorySidebarSteps steps2 = inventorySteps.doClickSidebar();
        inventorySteps.doClickCloseSidebar();
        steps2.verifyThatSidebarCloses();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarLogoutStandardUser(String login, String password){
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        InventorySidebarSteps steps2 = inventorySteps.doClickSidebar();
        inventorySteps.doClickLogout();
        steps2.verifyThatLogoutWorks();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarAboutStandardUser(String login, String password){
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        InventorySidebarSteps steps2 = inventorySteps.doClickSidebar();
        inventorySteps.doClickAbout();
        steps2.verifyThatAboutWorks();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarAllItemsStandardUser(String login, String password){
        visit("");
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        InventorySidebarSteps steps2 = inventorySteps.doClickSidebar();
        inventorySteps.doClickAllItems();
        steps2.verifyThatAllItemsWorks();
    }
}
