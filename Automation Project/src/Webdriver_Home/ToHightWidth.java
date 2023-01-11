package Webdriver_Home;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHightWidth {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome..driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Dimension dim = driver.manage().window().getSize();
	System.out.println(dim);
	
 int Width = dim.getWidth();
 int Height = dim.getHeight();
 
 
 System.out.println("the width:"+Width);
 System.out.println("thie Hiegth:"+Height);
	}

}
