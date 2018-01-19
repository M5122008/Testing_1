package Test_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testing_DependMethod {
	@Test
	public void openBrowser() {
		
		System.out.println("I am opening a browser");
		
		
	}
	@Test(dependsOnMethods= {"openBrowser"})
	public void LaunchUrl() {
		
		System.out.println("Now launching a website");
		String url="http://toolsqa.com/selenium-webdriver/testng-annotations-groups-depends/";
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.close();
		
	}
	@Test(dependsOnMethods= {"LaunchUrl"})
	public void CloseBrowser() {
		System.out.println("Finally closing the browser");
		
	}
	
}
