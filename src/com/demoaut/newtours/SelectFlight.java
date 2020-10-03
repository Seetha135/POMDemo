package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	//@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type='radio']")
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")
	private WebElement departFlight;
	
	//@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type=\'radio\']")
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")
	private WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	private WebElement submit;
	
	public SelectFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void flightSelection()
	{
		
		departFlight.click();
		returnFlight.click();		
		submit.click();
	}

}