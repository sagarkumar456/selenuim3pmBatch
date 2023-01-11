package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoerdEnterUesrnameAndPwd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		 
		WebElement UserTextField = driver.findElement(By.id("username"));
		WebElement PwdTextField = driver.findElement(By.name("pwd"));
		
		 UserTextField.sendKeys(" trainee");
		 Thread.sleep(2000);
		 
		 UserTextField.sendKeys(Keys.CONTROL,"a");
		 UserTextField.sendKeys(Keys.CONTROL,"c");
		 UserTextField.sendKeys(Keys.CONTROL,"v");
		 Thread.sleep(2000);
		 PwdTextField.sendKeys(Keys.ENTER);
		 

	}

}
