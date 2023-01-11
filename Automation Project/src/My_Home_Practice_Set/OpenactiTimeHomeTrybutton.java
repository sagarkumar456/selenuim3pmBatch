package My_Home_Practice_Set;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenactiTimeHomeTrybutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		Thread.sleep(10000);
		
		
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(!id.equals(parentWindowId)) {
				driver.findElement(By.linkText("Try Free")).click();
				break;
		
		
		}
		}

		driver.switchTo().window(parentWindowId);
		driver.findElement(By.linkText("actiTIME Incc"));
	}

}
