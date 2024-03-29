package pages;

import helpers.WebDriverTest;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TrivagoPage {
    final WebDriver driver = WebDriverTest.getDriver();

    @FindBy(css = "input[id='input-auto-complete']")
    private WebElement searchPlace;
    @FindBy(css = "div[class='flex items-center h-14']")
    private List<WebElement> cityLocations;
    @FindBy(css = "input[id=input-auto-complete]")
    private WebElement checkCity;
    @FindBy(css = "button[data-testid=search-form-calendar-checkin]")
    private WebElement checkInDate;
    @FindBy(css = "h3[class='text-heading-s font-bold mx-3 pb-3 font-bold']")
    private WebElement calendarMonth;
    @FindBy(xpath = "//button[@data-testid='calendar-button-next']")
    private WebElement calendarNextButton;
    @FindBy(css = "button[class='flex justify-center focus:outline-none h-9 text-m CalendarDay_dayFocusState__kThyH']")
    private List<WebElement> calendarDays;
    @FindBy(css = "button[data-testid='guest-selector-apply']")
    private WebElement applyButton;
    @FindBy(css = "button[data-testid=children-amount-plus-button]")
    private WebElement plusButtonForChildren;
    @FindBy(css = "select[class='appearance-none h-10 border pl-4 pr-10 bg-no-repeat bg-right rounded-sm border-grey-300 bg-white']")
    private WebElement child1AgeList;
    @FindBy(css = "select[id=childrens-age16]")
    private WebElement child2AgeList;

    public void navigateToTrivagoPage() {
        driver.get("https://www.trivago.com/");
    }

    public void acceptCookies() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
//        //js.executeScript("return document.querySelector(\"button[data-testid='uc-accept-all-button']\").shadowRoot.querySelector(\"button[data-testid='uc-accept-all-button']\")");
        WebElement element = (WebElement) js.executeScript("return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"button[data-testid='uc-accept-all-button']\")");
        //WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#usercentrics-root"));
//        //shadowRoot.findElement(acceptCookie).click();
        element.click();
    }

    public void clickOnSearchPlace() {
        searchPlace.click();
    }

    public void searchForRome() {
        searchPlace.sendKeys("ROME");
        cityLocations.get(0).click();
        Assert.assertTrue("The city is not ROME", checkCity.isDisplayed());
    }

    public void SelectDateFromCalendar() {
        while (!calendarMonth.getText().contains("March 2024")) {
            calendarNextButton.click();
        }
        for (int i = 0; i < calendarDays.size(); i++) {
            String text = calendarDays.get(i).getText();
            if (text.equalsIgnoreCase("14")) {
                calendarDays.get(i).click();
            }
        }
    }

    public void select2ChildrenFromOptionGuestAndRooms() {
        for (int i = 0; i < 2; i++) {
            plusButtonForChildren.click();
        }
    }

    public void selectChildAge() {
        WebElement ddown = child1AgeList;
        Select select = new Select(ddown);
        select.selectByValue("9");

        WebElement ddown2 = child2AgeList;
        Select select2 = new Select(ddown2);
        select2.selectByValue("11");
    }

    public void clickOnApplyButton() {
        applyButton.click();
    }
}
