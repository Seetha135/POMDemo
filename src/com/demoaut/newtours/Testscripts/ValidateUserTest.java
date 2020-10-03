package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Login;

public class ValidateUserTest extends BaseTest {
	
	@Test
	public void userValidation() {
		Login lp= new Login(driver);
		lp.applicationLogin("mercury","mercury");
		
String expMsg="Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city.";
String actMsg=driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > font")).getText();

Assert.assertEquals(actMsg, expMsg);
	}
	
	
}
