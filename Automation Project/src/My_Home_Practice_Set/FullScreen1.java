package My_Home_Practice_Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen1 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Demo.html");
		driver.manage().window().maximize();
	       WebElement Username = driver.findElement(By.id("123"));
	       Username.sendKeys("sagar kumar");
	       
	       
	      WebElement Password = driver.findElement(By.id("345"));
	      Password.sendKeys("sagardas4789");
	       
	}

}
