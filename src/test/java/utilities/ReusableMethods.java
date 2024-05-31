package utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;


import static utilities.Driver.driver;


public class ReusableMethods {

    public static void elementinUzerineGel(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        wait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }

    public static void acceptCookies() {

        By cookieAcceptButtonLocator = By.xpath("//div[@id='cookiescript_accept']");
        WebElement cookieAcceptButton = driver.findElement(cookieAcceptButtonLocator);

        if (cookieAcceptButton.isDisplayed() && cookieAcceptButton.isEnabled()) {
            cookieAcceptButton.click();
        }
    }
}