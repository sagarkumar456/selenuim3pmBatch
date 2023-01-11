package My_Home_Practice_Set;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServBettetLogingPageToHomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://servbetter.com/buyer-login");
		String Prarent = driver.getWindowHandle();
		driver.findElement(By.linkText("Sign up")).click();
		Set<String> ChildWindow = driver.getWindowHandles();
		
		Thread.sleep(10000);
		for(String id:ChildWindow) {
			driver.switchTo().window(id);
			if(!id.equals(Prarent)) {
				driver.findElement(By.linkText("Home")).click();
				
			}
			
		}
		

	}

}
