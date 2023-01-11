package AkashSir_Qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIndipentAndDepedentXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=one+plus+10r+black&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_15_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_15_na_na_ps&as-pos=2&as-type=RECENT&suggestionId=one+plus+10r+black%7CMobiles&requestId=108c1cee-3bd7-477e-b442-f68c2041746d&as-searchtext=one%20plus%20%2010r%20bl");
		
		 WebElement Price = driver.findElement(By.xpath("//div[text()='OnePlus 10R 5G (Sierra Black, 128 GB)']/../..//div[text()='₹34,950']"));
		 String actualprice = Price.getText();
		 System.out.println(actualprice);
	}

}
