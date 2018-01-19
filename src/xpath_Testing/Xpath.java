package xpath_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		//driver=new ChromeDriver(opt);
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*driver.get("https://www.guru99.com/");
	System.out.println("website launched successfully");
	String val=driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//*[text()='Testing']")).getText();
	System.out.println("value of xpath is: " + val);
	*/
	System.out.println("new website testing");
	driver.get("http://demo.guru99.com/v1/");
	String val1=driver.findElement(By.xpath("//input[@name='uid']")).getTagName();
	driver.findElement(By.xpath("//input[@name='uid']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("astha");
	Thread.sleep(2000);
	System.out.println("value is "+ val1);
	System.out.println("testing contains functionality");
	String val2=driver.findElement(By.xpath("//*[contains(@name,'btn')]")).getTagName();
	System.out.println(val2);
	driver.findElement(By.xpath("//*[contains(@name,'btn')]")).click();
	
	Thread.sleep(2000);
	driver.close();
	
	}

}
