package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToActitimeUsernameANdPAssword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement Username = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.name("pwd"));
		
		WebElement LogingButton = driver.findElement(By.xpath("Login "));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='admin'", Username);
		
		js.executeScript("arguments[0].value='password'", password);
		
		
		js.executeScript("arguments[0].click()", LogingButton);
	
	}

}
