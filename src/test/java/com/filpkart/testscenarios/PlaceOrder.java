package com.filpkart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.Base.TestBase;
import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.Selectproductpage;

import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	
	@BeforeClass
	public void setUp() {
		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void tearDown() {
	}
	
	@Test(priority=1)
	public void loginTest() {
		LoginPage loginPage = new LoginPage();
		boolean actResult = ( loginPage).validateLogin("9094018902", "Asdf@123");
		Assert.assertTrue(actResult);
	}

	
	@Test(priority=2)
	public void seachProductTest() {
		SearchProductPage searchProductPage = new SearchProductPage();
		searchProductPage.validateSearchProduct("laptop");
	}
	
	@Test(priority=3)
	public void selectProductTest() {
		Selectproductpage  Selectproductpage = new Selectproductpage();
		boolean actResult = Selectproductpage.validateSearchProduct();
		Assert.assertTrue(actResult); 
		System.out.println("Title in select product: " + driver.getTitle());
		
	}
	
	@Test(priority=4)
	public void addToCartTest() {
		AddToCartPage addToCartPage = new AddToCartPage(); 
		addToCartPage.validateAddToCart();
	}
	
	@Test
	public void placeOrderTest() {
	}
	
	@Test
	public void makePayment() {
	}
	
	@Test
	public void logoutTest() {
	}
	
}
