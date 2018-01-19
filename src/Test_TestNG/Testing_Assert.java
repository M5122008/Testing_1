package Test_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing_Assert {
private static WebDriver driver;
@Test
public void f() {
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.store.demoqa.com");
	
	
	WebElement myAcc=driver.findElement(By.xpath(".//*[@id='account']/a"));
	Assert.assertTrue(myAcc.isDisplayed());
	myAcc.click();
	
}

	
}
