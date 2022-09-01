package datadrivenframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-a6tbu7j/login.jsp");
	Flib flib = new Flib();
	 int rc = flib.getRowCount("./data/testData.xlsx", "invalidcreds");
	for(int i=1;i<=rc;i++) {
	String username = flib.readExcelData("./data/testData.xlsx", "invalidcreds", i, 0);
	String password = flib.readExcelData("./data/testData.xlsx", "invalidcreds", i, 1);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("username")).clear();
	}
	driver.quit();
	
	}

}
