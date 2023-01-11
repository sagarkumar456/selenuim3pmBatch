package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerfromBrowserHistiryNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\chromedriver.exe");
            ChromeDriver driver= new ChromeDriver();
            driver.get("https://www.google.com/");
            Thread.sleep(2000);
            Object nav;
			nav.to("https://www.facebook.com/");
            Thread.sleep(2000);
            nav.forwrad();
            Thread.sleep(2000);
            nav.refresh();
            

	} 

}
