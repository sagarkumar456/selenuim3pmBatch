package PoymorePhism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassADriver {

	;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "E:\\selenum_automaton\\Automation Project\\drivers\\geckodriver.exe");
		//System.setProperty(null, null);
		
		
		ClassA.test(new ChromeDriver(),"https://www.google.com/", "Google");
		ClassA.test(new EdgeDriver(), "https://www.google.com/",  "Google");
		

	}

}
