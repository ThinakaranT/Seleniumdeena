package Com.testscenarious;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowntest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");	
	    
  }
}
