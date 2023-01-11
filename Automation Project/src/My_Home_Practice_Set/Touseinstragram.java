package My_Home_Practice_Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touseinstragram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("skdas1641999@gmail.com");
		
	     
	}

}
