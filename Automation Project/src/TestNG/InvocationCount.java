package TestNG;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=5)
	public void DemoTest() {
		System.out.println("Test");
	}
	@Test(invocationCount=10)
	public void RunTest() {
		System.out.println("Run");
		}
	@Test(invocationCount = 15)
	public void ExamTest() {
		System.out.println("Exam");
	}

}
