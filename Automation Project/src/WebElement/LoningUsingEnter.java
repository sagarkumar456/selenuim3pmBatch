package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoningUsingEnter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		WebElement pwdTextFild= driver.findElement(By.name("pwd"));
		 pwdTextFild.sendKeys("manager");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER);
	}

}
