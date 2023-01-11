package My_Home_Practice_Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFbUsernameAnsPassowrd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("skdas1641999@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sagardas123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
