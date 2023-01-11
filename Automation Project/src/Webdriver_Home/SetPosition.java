package Webdriver_Home;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point ps=new Point(500,500);
		Thread.sleep(4000);
		driver.manage().window().setPosition(ps);
	}

}
