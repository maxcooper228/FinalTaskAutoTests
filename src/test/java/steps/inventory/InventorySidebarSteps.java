package steps.inventory;

import pages.inventory.InventorySidebarPage;

public class InventorySidebarSteps {
    InventorySidebarPage page = new InventorySidebarPage();

    public void verifyThatOk(){

        page.assertThatSidebarOpens();
    }
    public void verifyThatSidebarCloses(){

        page.assertThatSidebarCloses();
    }
    public void verifyThatLogoutWorks(){

        page.assertThatLogoutWorks();
    }
    public void verifyThatAboutWorks(){

        page.assertThatAboutWorks();
    }
    public void verifyThatAllItemsWorks(){

        page.assertThatAllItemsWorks();
    }
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
        page.clickSidebar();
    }
    private void clickAllItems(){
        page.clickAllItems();
    }
    private void clickAbout(){
        page.clickAbout();
    }
    private void clickLogout(){
        page.clickLogout();
    }
    private void clickReset(){
        page.clickResetAppState();
    }
    private void clickCloseSidebar(){
        page.clickCloseSidebar();
    }


}
