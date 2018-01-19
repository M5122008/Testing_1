package prog_Pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class Registration {
	public static String email = "vermavars@gmail.com";
	public static String password = "Test@123";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();		
        String baseUrl = "http://automationpractice.com/index.php?controller=my-account";
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(4000);
		driver.findElement(By.cssSelector(".login")).click();
		driver.findElement(By.id("email_create")).sendKeys(email);
		Thread.sleep(4000);
		driver.findElement(By.id("SubmitCreate")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"id_gender1\"]")));
		driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
		
		
		driver.findElement(By.id("customer_firstname")).sendKeys("aVarsha");;
		driver.findElement(By.id("customer_lastname")).sendKeys("aVerma");
		driver.findElement(By.id("passwd")).sendKeys(password);
		
		driver.findElement(By.id("firstname")).sendKeys("varsha");
		driver.findElement(By.id("lastname")).sendKeys("verma");
		driver.findElement(By.id("address1")).sendKeys("123");
		driver.findElement(By.id("city")).sendKeys("Delhi");
		Select city = new Select (driver.findElement(By.id("id_state")));
		city.selectByVisibleText("Texas");
		driver.findElement(By.id("postcode")).sendKeys("47011");
		driver.findElement(By.id("phone_mobile")).sendKeys("9845694694");
		driver.findElement(By.id("submitAccount")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();	
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
