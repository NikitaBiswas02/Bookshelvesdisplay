package com.ul.qa.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Reporter;



public class CollectionSubMenuPage  {
	WebDriver driver;
	 Properties prop = new Properties();
	 
	 //Element Locators:
	 By collectionElements = By.xpath("//*[@id='topnav_wrapper']/ul/li[10]/span");
	 By submenuElements = By.xpath("//ul[@class='taxonslist']/li/a/span");

	public CollectionSubMenuPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//For Clicking on Collection menu:
	public void clickOnCollection() throws InterruptedException {
		 WebElement collection = driver.findElement(collectionElements);
		 Thread.sleep(3000);
	      collection.click();
	      Thread.sleep(8000);
	}
	
	//To store the Submenus of Bring At Home:
	public void displaySubmenu() throws Exception
	 {
	  List<WebElement>allMenu = driver.findElements(submenuElements);
      System.out.println("\n"+"The submenu list from 'Being at home' column:");
      Reporter.log("\n"+"The submenu list from 'Being at home' column:");
  
      List<String> submenuList = new ArrayList<>();
      int submenuSize = allMenu.size();
      
      for(int i=0;i<submenuSize;i++)
	        { 
     	 String menu = allMenu.get(i).getText();
     	 submenuList.add(menu);
	        }
      submenuList.removeAll(Arrays.asList("", null));
      
      
      for(int i=0;i<13;i++)
	        {
	        	System.out.println(submenuList.get(i).toString());
	        	Reporter.log(submenuList.get(i).toString());
	        }


	    }



}


