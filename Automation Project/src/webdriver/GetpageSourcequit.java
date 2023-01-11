package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetpageSourcequit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://integrator.actitime.com/auth/at");
			
			driver.findElement(By.linkText("actiTIME Inc")).click();
		    driver.quit();
		
	}

}
