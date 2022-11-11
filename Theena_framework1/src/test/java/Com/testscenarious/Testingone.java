package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingone {

	public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("thinakaran019@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("theenafebila94");
        driver.findElement(By.name("login")).click();
	}

}
