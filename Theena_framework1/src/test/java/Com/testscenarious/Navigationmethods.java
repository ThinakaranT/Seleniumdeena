package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
        driver.findElement(By.id("signup-link9")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("signup_name")).sendKeys("theena");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
	}

}
