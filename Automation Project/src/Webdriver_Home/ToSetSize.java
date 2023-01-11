package Webdriver_Home;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
	 ChromeDriver driver =new ChromeDriver();
	 Thread.sleep(2000);
	 Dimension dim =new Dimension(500,200);
	 driver.manage().window().setSize(dim);
	}

}
