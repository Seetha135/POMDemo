package com.demoaut.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//private WebElement user=driver.findElement(By.name("userName")).sendKeys("mercury");
	
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement submit;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * @param uname
	 * @param pwd
	 */
	public void applicationLogin(String uname,String pwd)
	
	{
		user.sendKeys(uname);
		pass.sendKeys(pwd);
		submit.click();
	}
	
	
	
	
	
	
	
	
}