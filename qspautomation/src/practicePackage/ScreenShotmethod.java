package practicePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotmethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.yatra.com/");
      //driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).sendKeys("bikes");
       Thread.sleep(4000);
       JavascriptExecutor jse=(JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,400);");
       Thread.sleep(4000);
       jse.executeScript("window.scrollBy(0,-400);");
       Thread.sleep(4000);
       jse.executeScript("window.scrollBy(0,document.body.scrollHeight);");
       Thread.sleep(4000);
       
       


}
}