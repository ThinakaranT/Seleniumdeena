package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownthree {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	  driver.findElement(By.className("login_button")).click();
	  driver.findElement(By.id("Button2")).click();
	  Thread.sleep(3000);
	  String alerttext = driver.switchTo().alert().getText();
	  System.out.println(alerttext);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.partialLinkText("User")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept(); 
  }
}
