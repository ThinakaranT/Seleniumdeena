package Com.testscenarious;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getallerrormessages {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://collegeweeklive.com/go-signup/");
	  Thread.sleep(3000);
	  driver.findElement(By.id("submit")).click();
	  Thread.sleep(3000);
	  List<WebElement> allerrormsg = driver.findElements(By.className("formValidationMessage"));
	  for (WebElement abc : allerrormsg) {
		  System.out.println(abc.getText());
		
	}
	 
  }
}
