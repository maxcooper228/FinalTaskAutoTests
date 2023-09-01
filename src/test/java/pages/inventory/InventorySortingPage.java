package pages.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class InventorySortingPage extends BasePage {
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select")
    WebElement sortingButton;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")
    WebElement sortingAZ;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")
    WebElement sortingZA;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")
    WebElement sortingLoHi;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")
    WebElement sortingHiLo;

    public void assertThatSortingOpens(){
        wait.until(d -> sortingButton.isDisplayed());
        assertThat(sortingAZ.isDisplayed()).isTrue();
        assertThat(sortingZA.isDisplayed()).isTrue();
        assertThat(sortingLoHi.isDisplayed()).isTrue();
        assertThat(sortingHiLo.isDisplayed()).isTrue();
    }
    public void assertThatSortingAZ(){
        wait.until(d -> sortingButton.isDisplayed());
        Select select = new Select(driver.findElement(By
               .xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
        select.selectByIndex(0);
        WebElement selectOption = select.getFirstSelectedOption();
        String buttonText = selectOption.getText();
       Assert.assertEquals(buttonText, "Name (A to Z)");
    }
    public void assertThatSortingZA(){
        wait.until(d -> sortingButton.isDisplayed());
        Select select = new Select(driver.findElement(By
                .xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
        select.selectByIndex(1);
        WebElement selectOption = select.getFirstSelectedOption();
        String buttonText = selectOption.getText();
        Assert.assertEquals(buttonText, "Name (Z to A)");
    }
    public void assertThatSortingLoHi(){
        wait.until(d -> sortingButton.isDisplayed());
        Select select = new Select(driver.findElement(By
                .xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
        select.selectByIndex(2);
        WebElement selectOption = select.getFirstSelectedOption();
        String buttonText = selectOption.getText();
        Assert.assertEquals(buttonText, "Price (low to high)");
    }
    public void assertThatSortingHiLo(){
        wait.until(d -> sortingButton.isDisplayed());
        Select select = new Select(driver.findElement(By
                .xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
        select.selectByIndex(3);
        WebElement selectOption = select.getFirstSelectedOption();
        String buttonText = selectOption.getText();
        Assert.assertEquals(buttonText, "Price (high to low)");
    }
    public void clickSortingButton(){
        wait.until(d -> sortingButton.isDisplayed());
        sortingButton.click();
    }
    public void clickSortingAZ(){
        wait.until(d -> sortingButton.isDisplayed());
        sortingButton.click();
        sortingAZ.click();
    }
    public void clickSortingZA(){
        wait.until(d -> sortingButton.isDisplayed());
        sortingButton.click();
        sortingZA.click();
    }
    public void clickSortingLoHi(){
        wait.until(d -> sortingButton.isDisplayed());
        sortingButton.click();
        sortingLoHi.click();
    }
    public void clickSortingHiLo(){
        wait.until(d -> sortingButton.isDisplayed());
        sortingButton.click();
        sortingHiLo.click();
    }
}
