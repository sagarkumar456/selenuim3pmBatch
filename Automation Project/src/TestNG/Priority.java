package TestNG;

import org.testng.annotations.Test;

public class Priority {

	
	@Test(priority = 3)
	public void ademo() {
		System.out.println("Demo Test a");	
	}
	@Test(priority = 1)
	public void Ademo() {
		System.out.println("Demo Test A");	
	}
	@Test(priority = 2)
	public void Bdemo() {
		System.out.println("Demo Test B");
	}
	
	@Test(priority = 4)
	public void edemo() {
		System.out.println("Demo Test e");	
	}
	@Test(priority = 5)
	public void hdemo() {
		System.out.println("Demo Test h");	
	}
	

}
