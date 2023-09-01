package pages.inventory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class InventoryPage extends BasePage {

    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(id = "react-burger-menu-btn")
    WebElement sidebarButton;

    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    WebElement basketButton;

    @FindBy(xpath = "//*[@id=\"inventory_sidebar_link\"]")
    WebElement allItems;

    @FindBy(xpath = "//*[@id=\"about_sidebar_link\"]")
    WebElement about;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logout;

    @FindBy(xpath = "//*[@id=\"reset_sidebar_link\"]")
    WebElement resetAppState;

    @FindBy(xpath = "//*[@id=\"react-burger-cross-btn\"]")
    WebElement closeSideBar;

    public void clickSidebar(){
        wait.until(d -> sidebarButton.isDisplayed());
        sidebarButton.click();
    }
    public void clickCloseSidebar(){
        wait.until(d -> closeSideBar.isDisplayed());
        closeSideBar.click();
    }

    public void clickAllItems(){
        wait.until(d -> allItems.isDisplayed());
        allItems.click();
    }

    public void clickAbout(){
        wait.until(d -> about.isDisplayed());
        about.click();
    }

    public void clickLogout(){
        wait.until(d -> logout.isDisplayed());
        logout.click();
    }

    public void clickResetAppState(){
        wait.until(d -> resetAppState.isDisplayed());
        resetAppState.click();
    }

    public void clickBasketButton(){
        wait.until(d -> basketButton.isDisplayed());
        basketButton.click();
    }


}
