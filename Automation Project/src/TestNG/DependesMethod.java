package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependesMethod {
	@Test(priority = 1)
	public void login() {
		System.out.println("Logged in Succesfuly");
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("product found");
	}
	
	@Test(dependsOnMethods ="search" )
	public void select() {
		Assert.fail();
		System.out.println("product has been selected");
	}
	
	@Test(dependsOnMethods ="select" )
	public void addToCart() {
		System.out.println("Product added ");
	}
	
	@Test(dependsOnMethods ="addToCart")
	public void payment() {
		System.out.println("paymant made Succesfuly");
	}
	
	@Test(dependsOnMethods = "payment")
	public void logout() {
		System.out.println("Logged out Succesfuly");
	}


}
