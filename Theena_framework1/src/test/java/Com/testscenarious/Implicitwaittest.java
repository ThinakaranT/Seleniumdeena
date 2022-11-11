package Com.testscenarious;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwaittest {
  @Test
  public void f() throws IOException {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  driver.get("https://collegeweeklive.com/go-signup/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  Select abc = new Select(driver.findElement(By.id("country")));
	  
	  abc.selectByVisibleText("INDIA");
	  
	  Date deenadate = new Date();
	  
	  DateFormat  df = new SimpleDateFormat("ddMMYYYY_HHmmss");
	  String timestamp = df.format(deenadate);
	  
	  File mypic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(mypic, new File(".\\screenshot\\test"+timestamp+".PNG"));
	  
	  
  }
}
