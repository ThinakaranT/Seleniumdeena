package Com.testscenarious;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest123 {
  @Test
  public void f() {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }
}
