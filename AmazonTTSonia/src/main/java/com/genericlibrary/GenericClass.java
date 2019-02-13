package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonpagefactory.AmazonPageFactory;

public class GenericClass {
   WebDriver driver;
   AmazonPageFactory pf;
   
   
   public void getSetup() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Desktop\\eclipse\\AmazonTTSonia\\Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   pf =PageFactory.initElements(driver, AmazonPageFactory.class);
	   driver.get(pf.getUrl());
	   driver.manage().window().maximize();
	   
   }
   
   
   public void signIn() {
	   pf.getClickSignButton().click();
	   pf.getUNameBox().sendKeys(pf.getUname());
	   pf.getUpassBox().sendKeys(pf.getUpass());
	   pf.getClickSignin().click();
   }
}
