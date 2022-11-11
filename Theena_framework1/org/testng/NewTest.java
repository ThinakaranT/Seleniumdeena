package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(4000);
  }
}
