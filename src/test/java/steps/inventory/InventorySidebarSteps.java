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
}
