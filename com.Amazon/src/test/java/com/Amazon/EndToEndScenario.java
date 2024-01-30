package com.Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EndToEndScenario {
	@Test
	public static void addToCartPage() {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		WebElement WebemailTextField = driver.findElement(By.xpath("//input[@id='ap_email']"));
		WebemailTextField.sendKeys("anilk261996@gmail.com");
		WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton.click();
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='ap_password']"));
		passwordTextField.sendKeys("Anil@2288");
		WebElement siginButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		siginButton.click();
		
		WebElement searchTextbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchTextbox.sendKeys("iphone");
		//Click Search Icon 
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//Click on add to cart button
		driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
		//Click on add to cart icon
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		//Click on proceedCheckoutButton
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		//Click on Use this adress button
		driver.findElement(By.xpath("//span[@id='shipToThisAddressButton']//span//input[@class='a-button-input']")).click();
		
		WebElement paymentMethodTextBox = driver.findElement(By.xpath("//span[@id='orderSummaryPrimaryActionBtn-announce']//span"));
		if(paymentMethodTextBox.isEnabled())
		{
			System.out.println("Procede to make payment");
		}else{
			System.out.println("Not able to make payment");
		}
		
	}
}
