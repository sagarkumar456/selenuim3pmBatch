package Webdriver_Home;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TofindPostion {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    Point position = driver.manage().window().getPosition();
   int startX = position.getX();
   int startY = position.getY();
   System.out.println("the start x is:"+startX);
   System.out.println("the start Y is:"+startY);

	}

}
