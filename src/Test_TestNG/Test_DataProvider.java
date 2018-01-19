package Test_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataProvider {
	private static WebDriver driver;
	@DataProvider(name="Authentication")
	public static Object[][] credentials()
	{
		return new Object[][] {{"mayank","muley"},{"chutiyapa","mat kar"}};
	}
	@Test(dataProvider="Authentication")
		public void test(String sUsername, String sPassword) {
			 
			  driver = new FirefoxDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("http://www.store.demoqa.com");
		 
		      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 
		      driver.findElement(By.id("log")).sendKeys(sUsername);
		 
		      driver.findElement(By.id("pwd")).sendKeys(sPassword);
		 
		      driver.findElement(By.id("login")).click();
		 
		      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		 
		      driver.quit();
		 
		  }
		 
	}
	

