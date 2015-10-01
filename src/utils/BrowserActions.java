package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver; 

public class BrowserActions {
	private static WebDriver driver;
	public static WebDriver OpenBrowser (String UsedBrowser) {
		WebDriver driver = null;
		switch (UsedBrowser) {
		case "Firefox":
			if (driver == null) {
				driver = new FirefoxDriver();
			}
			break;
		case "IE":
			if (driver == null) {
				System.setProperty("webdriver.ie.driver",
						"D:\\AUTOMATION\\autoTools\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			break;
		case "Chrome":
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\AUTOMATION\\autoTools\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			break;
		}
		return driver;
	}
	
	public static void CloseBrowser(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
}

