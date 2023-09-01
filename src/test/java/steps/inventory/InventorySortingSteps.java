package steps.inventory;

import pages.inventory.InventorySortingPage;

public class InventorySortingSteps {
    InventorySortingPage page = new InventorySortingPage();

    public void verifyThatSortingOpens(){

        page.assertThatSortingOpens();
    }
    public void verifyThatSortingAZ(){
        page.assertThatSortingAZ();
    }
    public void verifyThatSortingZA(){
        page.assertThatSortingZA();
    }
    public void verifyThatSortingLoHi(){
        page.assertThatSortingLoHi();
    }
    public void verifyThatSortingHiLo(){
        page.assertThatSortingHiLo();
    }
    private void clickSortingAZ(){

        page.clickSortingAZ();
    }
    private void clickSortingLoHi(){
        page.clickSortingLoHi();
    }
    private void clickSortingHiLo(){
        page.clickSortingHiLo();
    }
    private void clickSortingZA(){
        page.clickSortingZA();
    }
    private void clickSortingButton(){

        page.clickSortingButton();
    }
    public InventorySortingSteps doClickSortingButton(){
        clickSortingButton();
        return new InventorySortingSteps();
    }

    public InventorySortingSteps doClickSortingHiLo(){
        clickSortingHiLo();
        return new InventorySortingSteps();
    }
    public InventorySortingSteps doClickSortingLoHi(){
        clickSortingLoHi();
        return new InventorySortingSteps();
    }
    public InventorySortingSteps doClickSortingAZ(){
        clickSortingAZ();
        return new InventorySortingSteps();
    }
    public InventorySortingSteps doClickSortingZA(){
        clickSortingZA();
        return new InventorySortingSteps();
    }
}
