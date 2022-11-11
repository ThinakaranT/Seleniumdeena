package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testtwo_java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.linkText("Create New Account")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.name("firstname")).sendKeys("Deena");
//		driver.findElement(By.name("lastname")).sendKeys("karan");
//		driver.findElement(By.name("reg_email__")).sendKeys("thinkaran019@gmail.com");
//		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thinkaran019@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("Deena1234");
//        Select t= new Select(driver.findElement(By.id("month")));
//        t.selectByVisibleText("May");
//        
//        Select d= new Select(driver.findElement(By.id("day")));
//        d.selectByVisibleText("10");
//        
//        Select y= new Select(driver.findElement(By.id("year")));
//        y.selectByVisibleText("1994");
//        
//        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
//        driver.findElement(By.name("websubmit")).click();
	}

}
