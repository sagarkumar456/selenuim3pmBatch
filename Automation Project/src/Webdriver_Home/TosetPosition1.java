package Webdriver_Home;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TosetPosition1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point ps=new Point(500,500);
		driver.manage().window().setPosition(ps);
		
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(-300,-200) );
		
	//Point	ps1=new Point(-50,-50);	
	//driver.manage().window().setPosition(ps1);
	}

}
