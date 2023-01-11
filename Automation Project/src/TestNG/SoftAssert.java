package TestNG;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void demo() {
		boolean expectedData=true;
		boolean actualData=true;//flase se fail hota hai
		org.testng.asserts.SoftAssert s=new org.testng.asserts.SoftAssert();
		s.assertEquals(actualData, expectedData);
		System.out.println("pass");
		s.assertAll();
	}

}
