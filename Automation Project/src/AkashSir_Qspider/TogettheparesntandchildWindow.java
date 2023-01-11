package AkashSir_Qspider;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogettheparesntandchildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		  String paresntId = driver.getWindowHandle();
		
		 driver.findElement(By.linkText("actiTIME Inc")).click();
		 
		Set<String> allwindowid = driver.getWindowHandles();
		for(String id:allwindowid) {
			driver.switchTo().window(id);
			if(!id.equals(allwindowid)) {
			        String childid = driver.getTitle();
			        System.out.println(childid);
		}
			
		

	}
		driver.switchTo().window(paresntId);
		String presenttitle = driver.getTitle();
		System.out.println(presenttitle);

	}
}