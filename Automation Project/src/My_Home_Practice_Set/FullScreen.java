package My_Home_Practice_Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(4000);;
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().fullscreen();
	}

}
