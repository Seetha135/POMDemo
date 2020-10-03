package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.BookAFlight;
import com.demoaut.newtours.FlightFinder;
import com.demoaut.newtours.Login;
import com.demoaut.newtours.SelectFlight;

public class BookaFlightTest extends BaseTest{
	//WebDriver driver;
	
	/*@BeforeTest
	public void openBrowser() {		
		
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
	}*/
	
		
		@Test
		public void bookTicket() {
			
			Login lp= new Login(driver);
			FlightFinder ff = new FlightFinder(driver);
			SelectFlight sf = new SelectFlight(driver);
		    BookAFlight baf = new BookAFlight(driver);
		    
            lp.applicationLogin("mercury","mercury");
            ff.findFlight();
            sf.flightSelection();
            baf.bookFlight("Seetha", "Lakshmi", "23456");
            
            String expMsg="Your itinerary has been booked!";
            String actMsg= driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
		    
            Assert.assertEquals(actMsg, expMsg);
		
		}
		
		/*@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}*/
		
	}

	       


