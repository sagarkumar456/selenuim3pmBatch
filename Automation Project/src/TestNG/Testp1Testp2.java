package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testp1Testp2 {
	@BeforeClass
	public void lunchBrowser() {
		System.out.println("Lunch the browser");
	}
	@BeforeClass
	public void Enetrurl() {
		System.out.println("enterb URL");
	}

}
