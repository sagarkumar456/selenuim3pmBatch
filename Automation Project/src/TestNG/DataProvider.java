package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
	/*if you run same test case multiple time multiple data*/
	@Test(dataProvider = "data")
	public void test(String state,String capital) {
		System.out.println(state+":"+capital);
		
	}
	@org.testng.annotations.DataProvider
	public Object [][]data(){
		Object[][]ar=new  Object[3][2];
		ar[0][0]="Dehli";
		ar[1][0]="Up";
		ar[2][0]="Bihar";
		
		
		ar[0][1]="New Dehli";
		ar[1][1]="Lucknow";
		ar[2][1]="Begnaluru";
		return ar;
	}

}
