package Test_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	private static WebDriver driver;
	@Test 
	@Parameters({"userName","password"})
	public void fun(String userName,String password) {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		 
	      driver.findElement(By.id("log")).sendKeys(userName);
	 
	      driver.findElement(By.id("pwd")).sendKeys(password);
	 
	      driver.findElement(By.id("login")).click();
		
	}

}
