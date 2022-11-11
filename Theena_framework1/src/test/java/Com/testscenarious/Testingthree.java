package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testingthree {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.pqe.io/sign-up");
		Thread.sleep(8000);
	    
		WebElement element = driver.findElement(By.xpath("//*select[@id="register']"));
		//Select dropdown = new Select(driver.findElement(By.id("I am ")));
		//dropdown.selectByValue("897");
		//*[@id="register"]/div[2]/div/div/select
     
		
	}

}
