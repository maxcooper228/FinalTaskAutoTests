package tests;

import org.testng.annotations.Test;
import steps.inventory.InventorySidebarSteps;
import steps.inventory.InventorySortingSteps;
import steps.login.LoginSuccessSteps;

public class InventorySortingTest extends BaseTest {


    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySortingOpensStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingButton();
        steps2.verifyThatSortingOpens();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySortingAZStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingAZ();
        steps2.verifyThatSortingAZ();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySortingZAStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingZA();
        steps2.verifyThatSortingZA();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySortingLoHiStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingLoHi();
        steps2.verifyThatSortingLoHi();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySortingHiLoStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingHiLo();
        steps2.verifyThatSortingHiLo();
    }
}
