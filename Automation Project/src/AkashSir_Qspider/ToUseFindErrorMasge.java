package AkashSir_Qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFindErrorMasge{

	String exceptedErrormsg=
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		
		String actualErrrormsg = driver.findElement(By.className("errormsg")).getText();
		
	
			if(actualErrrormsg.equals(exceptedErrormsg))
			{
				
			}
			else
			{
				
				
			}
		}
		
		
	}

}
