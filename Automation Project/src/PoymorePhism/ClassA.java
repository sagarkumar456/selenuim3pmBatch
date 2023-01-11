package PoymorePhism;

import org.openqa.selenium.WebDriver;

public class ClassA {
	public static void  test(WebDriver driver,String url,String exepectedTitle) {
		driver.get(url);
		String acutalTitle = driver.getTitle();
		
		if(acutalTitle.equals(exepectedTitle)) {
			System.out.println("pass the titl id  verifed");
		}
		else
		{
			System.out.println("Fail the Titlt is not verifid");
		}
		driver.quit();
	}
  
}
