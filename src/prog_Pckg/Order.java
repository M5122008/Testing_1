package prog_Pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Order {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		WebDriver driver = new FirefoxDriver();		
        String baseUrl = "http://automationpractice.com/index.php?controller=my-account";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(4000);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("vermavarsha@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Test@123");
        Thread.sleep(4000);
        driver.findElement(By.id("SubmitLogin")).click();
        driver.findElement(By.linkText("My addresses")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='center_column']/div[1]/div/div/ul/li[9]/a[1]/span")).click();
        driver.findElement(By.xpath(".//*[@id='address1']")).clear();
        driver.findElement(By.xpath(".//*[@id='address1']")).sendKeys("Flat No. 111");
        Thread.sleep(4000);
        driver.findElement(By.id("submitAddress")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Sign out")).click();
        Thread.sleep(4000);
        driver.close();
		
	}

}
