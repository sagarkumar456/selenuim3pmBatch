package AkashSir_Qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowIDs {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		String windowId = driver.getWindowHandle();
		System.out.println( windowId);
		
		WebDriver driver1 = new ChromeDriver();
		 String windowId2 = driver1.getWindowHandle();
		 System.out.println( windowId2);
		 
	}

}
