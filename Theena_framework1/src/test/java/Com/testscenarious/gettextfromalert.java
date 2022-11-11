package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettextfromalert {
  private static final Object third_alert = null;

@Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(3000);
	  String abctext = driver.switchTo().alert().getText();
	  System.out.println(abctext);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.id("timerAlertButton")).click();
	  Thread.sleep(6000);
	  String printtext = driver.switchTo().alert().getText();
	  System.out.println(printtext);
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(6000);
	  String deftext = driver.switchTo().alert().getText();
	  System.out.println(deftext);
	  driver.switchTo().alert().accept();
	  Thread.sleep(5000);
	  
	  if (deftext.equals("Do you confirm action?")) {
		  System.out.println("You select ok");
	  } else {
		  System.out.println("You selected Cancel");
	  }
	    
	  driver.findElement(By.id("promtButton")).click();
	  String ghitext = driver.switchTo().alert().getText();
	  System.out.println(ghitext);
	  Thread.sleep(2000);
	  driver.switchTo().alert().sendKeys("Deena");
  }
}
