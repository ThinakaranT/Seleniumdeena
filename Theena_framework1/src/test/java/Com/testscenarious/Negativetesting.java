package Com.testscenarious;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Negativetesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		Thread.sleep(5000);
		
		driver.findElement(By.name("imgbtnSubmit")).click();
		String abc = driver.findElement(By.id("nameTD")).getText();
        System.out.println(abc);
	}

}
