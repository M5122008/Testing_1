
package prog_Pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_1 {

	

	//	System.setProperty("webdriver.firefox.marionette","C:\\Users\\User\\Desktop\\geckodriver.exe");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		/*System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  			*/
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
				
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.linkText("REGISTER")).click();
        
        driver.close();
      //comment the above 2 lines and uncomment below 2 lines to use Chrome
      		
        }

}
