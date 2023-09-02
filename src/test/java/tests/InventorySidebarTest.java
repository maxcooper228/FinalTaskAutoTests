package tests;

import org.testng.annotations.Test;
import steps.inventory.InventorySidebarSteps;

public class InventorySidebarTest extends BaseTest {                                        // Даний клас перевіряє елементи бокового меню на те що вони натискаються


    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarStandardUser(String login, String password){            // Відкриття сайдбару
        loginMethod(login, password);
        InventorySidebarSteps steps2 = new InventorySidebarSteps();
        steps2.doClickSidebar();
        steps2.verifyThatOk();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarClosesStandardUser(String login, String password){          // Відкриття та закриття сайдбару
        loginMethod(login, password);
        InventorySidebarSteps steps2 = new InventorySidebarSteps();
        steps2.doClickSidebar();
        steps2.doClickCloseSidebar();
        steps2.verifyThatSidebarCloses();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarLogoutStandardUser(String login, String password){          // Відкриття сайдбару, логаут, перевірка що логаут відбувся
        loginMethod(login, password);
        InventorySidebarSteps steps2 = new InventorySidebarSteps();
        steps2.doClickSidebar();
        steps2.doClickLogout();
        steps2.verifyThatLogoutWorks();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarAboutStandardUser(String login, String password){           // Відкриття сайдбару, клік по About
        loginMethod(login, password);
        InventorySidebarSteps steps2 = new InventorySidebarSteps();
        steps2.doClickSidebar();
        steps2.doClickAbout();
        steps2.verifyThatAboutWorks();
    }
    @Test(dataProvider = "loginDataCorrectStandardUser")
    public void testInventorySidebarAllItemsStandardUser(String login, String password){        // Відкриття сайдбару, клік по All Items,
                                                                                                // перевірка що переносить на головну сторінку веб-магазину
        loginMethod(login, password);
        InventorySidebarSteps steps2 = new InventorySidebarSteps();
        steps2.doClickSidebar();
        steps2.doClickAllItems();
        steps2.verifyThatAllItemsWorks();
    }
}
