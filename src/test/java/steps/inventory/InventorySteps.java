package steps.inventory;

import pages.inventory.InventoryPage;
import pages.inventory.InventorySortingPage;


public class InventorySteps {
    InventoryPage inventoryPage = new InventoryPage();
    InventorySortingPage inventorySortingPage = new InventorySortingPage();

    public InventorySidebarSteps doClickSidebar(){
        clickSidebar();
        return new InventorySidebarSteps();
    }
    public InventorySidebarSteps doClickCloseSidebar(){
        clickCloseSidebar();
        return new InventorySidebarSteps();
    }
    public InventorySidebarSteps doClickLogout(){
        clickLogout();
        return new InventorySidebarSteps();
    }
    public InventorySidebarSteps doClickAbout(){
        clickAbout();
        return  new InventorySidebarSteps();
    }
    public InventorySidebarSteps doClickAllItems(){
        clickAllItems();
        return new InventorySidebarSteps();
    }

    private void clickSidebar(){
        inventoryPage.clickSidebar();
    }
    private void clickAllItems(){
        inventoryPage.clickAllItems();
    }
    private void clickAbout(){
        inventoryPage.clickAbout();
    }
    private void clickLogout(){
        inventoryPage.clickLogout();
    }
    private void clickReset(){
        inventoryPage.clickResetAppState();
    }
    private void clickCloseSidebar(){
        inventoryPage.clickCloseSidebar();
    }


}
