package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHenladfileDownload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.apidog.com/?utm_source=google_search&utm_medium=ads_sa&utm_term=function&gclid=CjwKCAiAkrWdBhBkEiwAZ9cdcPNo0RHVSG1zaDqKb2SiL2GjfO62h7VrlShQKXV_RKDALN6Dt_5dxRoCHtoQAvD_BwE");

		driver.findElement(By.xpath("//span[@class='slogan__buttonGroup_download_text___2i5Hf px-2']")).click();
		
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
}
}