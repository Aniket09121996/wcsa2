package launchBrowser;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("-start-maximized");
		ChromeDriver driver = new ChromeDriver(co);
		
		

	}

}
