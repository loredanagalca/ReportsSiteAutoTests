package Test;
import utils.HomePageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=utils.BrowserActions.OpenBrowser("Chrome");
		driver.get(utils.HomePageLocators.HomePageUrl);
		assert driver.getTitle() == utils.HomePageLocators.HomePageTitle;
		WebElement welcomeMsg = driver.findElement(By.className(utils.HomePageLocators.CloseWelcomeMsg_btn_class));
		if (welcomeMsg.isDisplayed()== true)
		{
			welcomeMsg.click();
		}
		driver.findElement(By.id(utils.HomePageLocators.SignIn_btn_id)).click();
		//utils.BrowserActions.CloseBrowser(driver);
	}
}

