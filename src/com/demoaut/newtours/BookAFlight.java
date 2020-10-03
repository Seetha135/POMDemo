package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	@FindBy(name="passFirst0")
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	private WebElement number;
	
	@FindBy(name="buyFlights")
	private WebElement submit;
	
	public BookAFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void bookFlight(String fName,String lName,String num)
	{
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		number.sendKeys(num);
		submit.click();

	}
	
}
