package pages.inventory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import pages.login.LoginPage;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class InventorySidebarPage extends BasePage {
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @FindBy(id = "login-button")
    WebElement button;
    @FindBy(id = "react-burger-menu-btn")
    WebElement sidebarButton;
    @FindBy(xpath = "//*[@id=\"react-burger-cross-btn\"]")
    WebElement closeSideBar;
    @FindBy(xpath = "//*[@id=\"inventory_sidebar_link\"]")
    WebElement allItems;

    @FindBy(xpath = "//*[@id=\"about_sidebar_link\"]")
    WebElement about;

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logout;

    @FindBy(xpath = "//*[@id=\"reset_sidebar_link\"]")
    WebElement resetAppState;
    public void assertThatSidebarOpens(){
        wait.until(d -> closeSideBar.isDisplayed());
        assertThat(closeSideBar.isDisplayed()).isTrue();
        assertThat(allItems.isDisplayed()).isTrue();
        assertThat(about.isDisplayed()).isTrue();
        assertThat(logout.isDisplayed()).isTrue();
        assertThat(resetAppState.isDisplayed()).isTrue();
    }
    public void assertThatSidebarCloses(){
        wait.until(d -> sidebarButton.isDisplayed());
        assertThat(sidebarButton.isDisplayed()).isTrue();
    }
    public void assertThatLogoutWorks(){
        wait.until(d -> button.isDisplayed());
        assertThat(button.isDisplayed()).isTrue();
    }
    public void assertThatAboutWorks(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://saucelabs.com/");
    }
    public void assertThatAllItemsWorks(){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");
    }
}
