package testngpack;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelBrowserExecution {
  @Test
  public void openChromeBrowser() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.google.com");
  	System.out.println(" chrome browser opened  " + Thread.currentThread().getId());
  	Thread.sleep(3000);
	driver.close();
  }
    @Test
    public void openFirefox() throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.google.com");
	System.out.println(" firefox browser opened  " + Thread.currentThread().getId());
	Thread.sleep(3000);
	driver.close();
    }

}
