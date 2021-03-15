package com.ul.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class DisplayChairsPage {
	WebDriver driver;
	 Properties prop = new Properties();
	 List<String> priceList = new ArrayList<>();
	 
	 //Element Locators:
	    By priceListElements = By.xpath("//div[@class='price-number']/span");
		By nameListElements = By.xpath("//span[@class='name']");
		

	public DisplayChairsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
      //Getting ChairsDetails:
	public void getChairsDetails() {
		List <WebElement> allPrice =  driver.findElements(priceListElements);
		List <WebElement> allName =  driver.findElements(nameListElements);
		
		System.out.println("\n"+ "3 study chair details with highest recommendation");
       Reporter.log("\n"+ "The price of the first three study chair");

       String pric, name;
       
       //List<String> priceList = new ArrayList<>();
	     int price;
	
	     int size = allPrice.size();
	     for(int i=0;i<size;i++)
	     { 
	     pric = allPrice.get(i).getText();
	     name= allName.get(i).getText();
	     pric = pric.replaceAll("₹","");
	     pric = pric.replaceAll(",","");
	     price = Integer.parseInt(pric);
	     priceList.add(name+":");
    	 priceList.add("Rs."+pric);
	     }
	     for(int i=0;i<6;i++)
	     {
    	System.out.println(priceList.get(i).toString());
    	Reporter.log(priceList.get(i).toString());
	     }
	}
	
}
		
	
	
	


