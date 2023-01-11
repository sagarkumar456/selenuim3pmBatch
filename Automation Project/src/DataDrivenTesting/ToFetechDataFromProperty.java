package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetechDataFromProperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/propertyData2.properties");
		
		Properties property = new Properties();
		
		property.load(fis);
		
		String url = property.getProperty("url");
		
		System.out.println("the url is:"+url);
		
		String username = property.getProperty("username");
		System.out.println("the username:"+username);
		
		String password = property.getProperty("password");
		System.out.println("the password:"+password);
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("url");
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys("password");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
