package launchBrowser;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.close();
		
		

	}

}

