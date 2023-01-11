package Sysnchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseImpliciwait {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Timeouts time = driver.manage().timeouts();
	time.implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://github.com/");
	driver.findElement(By.id("_email")).sendKeys("skdas@gmail.com");

}
}