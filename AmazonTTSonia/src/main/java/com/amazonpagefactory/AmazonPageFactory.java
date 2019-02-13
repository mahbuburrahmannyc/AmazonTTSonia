package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	private String url="https://www.amazon.com/";
	private String Uname="satvinderk42@gmail.com";
	private String Upass="Sonia.1995";
	
	

	

	@FindBy(xpath="//*[@class='nav-a nav-a-2']")
	private WebElement ClickSignButton;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement UNameBox;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement UpassBox;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSignin;
	
	
	
	public WebElement getUNameBox() {
		return UNameBox;
	}

	public WebElement getUpassBox() {
		return UpassBox;
	}

	public String getUrl() {
		return url;
	}

	public WebElement getClickSignButton() {
		return ClickSignButton;
	}

	public String getUname() {
		return Uname;
	}

	public String getUpass() {
		return Upass;
	}

	public WebElement getClickSignin() {
		return ClickSignin;
	}
}
