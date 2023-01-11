package AkashSir_Qspider;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllid {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.linkText("actiTIME Inc")).click();
		Thread.sleep(3000);
		Set<String> allWindow = driver.getWindowHandles();
         for(String id:allWindow) {
        	 driver.switchTo().window(id);
        	 if(!id.equals(allWindow)) {
        		 driver.close();
        	 }
         }
		
		
		
	}

}
