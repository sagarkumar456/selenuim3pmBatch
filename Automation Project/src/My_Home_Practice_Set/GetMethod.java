package My_Home_Practice_Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		System.out.println("Open the Actitime Home page");
		String title = driver.getTitle();
		System.out.println("Actitime Title:"+title);
		
		
		String CurrnetUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl"+CurrnetUrl);
		
		
		

	}

}
