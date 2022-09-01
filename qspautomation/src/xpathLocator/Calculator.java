package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.cli.CliCommand;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        //
        driver.findElement(By.xpath("//span[@class='sciop'and .='+']")).click();
        //
        driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
        //
        String result = driver.findElement(By.id("sciOutPut")).getText();
        System.out.println(result);
        
	}

}
