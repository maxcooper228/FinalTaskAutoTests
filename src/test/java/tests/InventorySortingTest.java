package tests;

import org.testng.annotations.Test;
import steps.inventory.InventorySortingSteps;

public class InventorySortingTest extends BaseTest {                                     // Даний клас перевіряє дропдаун варіантів сортировок товарів на сторінці


    @Test(dataProvider = "loginDataCorrectStandardUser")                                    // Перевірка наявності дропдауна
    public void testInventorySortingOpensStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingButton();
        steps2.verifyThatSortingOpens();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")                                    // Сортування за алфавітом по зростанню
    public void testInventorySortingAZStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingAZ();
        steps2.verifyThatSortingAZ();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")                                    // Сортування за алфавітом по спаданню
    public void testInventorySortingZAStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingZA();
        steps2.verifyThatSortingZA();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")                                    // Сортування за ціною по зростанню
    public void testInventorySortingLoHiStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingLoHi();
        steps2.verifyThatSortingLoHi();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")                                    // Сортування за ціною по спаданню
    public void testInventorySortingHiLoStandardUser(String login, String password){
        loginMethod(login, password);
        InventorySortingSteps steps2 = new InventorySortingSteps();
        steps2.doClickSortingHiLo();
        steps2.verifyThatSortingHiLo();
    }
}
