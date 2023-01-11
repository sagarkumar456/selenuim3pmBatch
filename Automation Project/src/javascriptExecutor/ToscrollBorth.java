package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToscrollBorth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=iphone+14+pro+max&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&as-pos=2&as-type=RECENT&suggestionId=iphone+14+pro+max%7CMobiles&requestId=a33e67a9-2f46-4623-a2d4-234c7d680cc7&as-searchtext=i");
		
		driver.manage().window().setSize(new Dimension(200,500));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(100,500)");
		
	}

}
