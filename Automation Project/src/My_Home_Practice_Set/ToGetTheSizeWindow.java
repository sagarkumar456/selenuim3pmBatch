package My_Home_Practice_Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheSizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		int hight = dim.getHeight();
		int width = dim.getWidth();
		
		System.out.println("the hight is"+hight);
		System.out.println( "the width is:"+width);
        
		
	}

}
