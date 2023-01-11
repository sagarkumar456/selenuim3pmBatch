package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



public class ClassE {
	
	@Test
	public void demo(String browser) {
	if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	if(browser.equals("edge")) {
		System.setProperty("webdriver.edge.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\geckodriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
		
	}

}
