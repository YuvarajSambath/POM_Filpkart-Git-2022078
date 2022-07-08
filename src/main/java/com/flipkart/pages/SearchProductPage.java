package com.flipkart.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.Base.TestBase;

import io.netty.handler.timeout.TimeoutException;

public class SearchProductPage extends TestBase {
	


	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	By seachLoc = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	//by          //*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg
	
	public boolean validateSearchProduct(String productName) {

		//wait(2000);

		driver.findElement(seachLoc).sendKeys (productName);

		wait (2000);

		driver.findElement(seachLoc).sendKeys(Keys.ENTER);

		
		boolean flagResult = true;
		
		
		
		try {

			Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/a")));
					
		}catch(TimeoutException te) { 
						captureScreenshot ("Search Failure");
					flagResult = false;
					
					
					}
		if(flagResult) {
			String actResult = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div[3]/a")).getText();
			
			return actResult.equals("Laptops");

		}

		else

		return false;
	}
}
		
		
		

		
