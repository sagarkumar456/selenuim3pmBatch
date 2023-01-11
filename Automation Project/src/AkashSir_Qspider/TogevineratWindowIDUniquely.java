package AkashSir_Qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogevineratWindowIDUniquely {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String winIDFoegoogle = driver.getWindowHandle();
		
		System.out.println("ID Google:"+winIDFoegoogle);
		WebDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		String winIdForFb = driver1.getWindowHandle();
		System.out.println("ID For FB:"+ winIdForFb);
	}

}
