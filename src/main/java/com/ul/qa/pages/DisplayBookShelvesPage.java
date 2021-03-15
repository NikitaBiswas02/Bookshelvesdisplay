package com.ul.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Reporter;


public class DisplayBookShelvesPage  {
	
	public static WebDriver driver;
	Properties prop = new Properties();
	
	
	public DisplayBookShelvesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Locators:
	By category =By.xpath("//*[@id='filters-form']/div[1]/div/div/ul/li[1]/div[1]");
	By bookshalve = By.xpath("//input[@id='filters_primary_category_Bookshelves']");
	
	By storageType = By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[3]/div[1]");
	By typeOpen = By.xpath("//input[@id='filters_storage_type_Open']");
	By outofstockCheckbox = By.xpath("//input[@id='filters_availability_In_Stock_Only']");
	By recomandation = By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span");
	By low = By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]");
	By priceListElements = By.xpath("//div[@class='price-number']/span");
	By nameListElements = By.xpath("//span[@class='name']");
	
	//Getting HomePageTitle:
	public String validateHomePageTitle() throws InterruptedException {
		Thread.sleep(8000);
		return driver.getTitle();
		
	}
	//Closeing PopUp Window:
	public void closePopup() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='authentication_popup']/div[1]/div/div[2]/a[1]")).click();
		
	}
	//Searching for item:
	public void searchBox(String input) throws InterruptedException {
		
		driver.findElement(By.id("search")).sendKeys(input);
		Thread.sleep(2000);
	}
	//For searching:
	public void clickOnSearchButton() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='search_button']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	//Selecting category:
	public void setCategory() throws InterruptedException {
		driver.findElement(category).click();
		Thread.sleep(2000);
		driver.findElement(bookshalve).click();
		Thread.sleep(2000);
	}
	//Selecting storageType:
	public void setStorageType() throws InterruptedException {
		driver.findElement(storageType).click();
		Thread.sleep(2000);
		driver.findElement(typeOpen).click();  
		Thread.sleep(2000);
	}
	//Selecting ExcludeOutOfStock:
	public void clickOutOfStock() throws InterruptedException {
		driver.findElement(outofstockCheckbox).click();
		Thread.sleep(2000);
	}
	//Selecting Recommendation:
	public void setRecommandation() throws InterruptedException {
		driver.findElement(recomandation).click();
		Thread.sleep(2000);
		driver.findElement(low).click();
		Thread.sleep(7000);
	}
	//Getting BookDetails:
	public void getBookDetails() throws InterruptedException {
		
	List <WebElement> allPrice =  driver.findElements(priceListElements);
	List <WebElement> allName =  driver.findElements(nameListElements);
  
    System.out.println("\n"+ "The price of the first three bookshelves below Rs.15000:");
    Reporter.log("\n"+ "The price of the first three bookshelves below Rs.15000:");

    String pric, name;
 
     List<String> priceList = new ArrayList<>();
     int price;

     int size = allPrice.size();
     for(int i=0;i<size;i++)
     { 
     pric = allPrice.get(i).getText();
     name= allName.get(i).getText();
     pric = pric.replaceAll("₹","");
     pric = pric.replaceAll(",","");
     price = Integer.parseInt(pric);
     
	     if(price < 15000)
	     {
		        	priceList.add(name+":");
		        	priceList.add("Rs."+pric);
		 } 
	     
     }
     
     for(int i=0;i<6;i++)
     {
 	System.out.println(priceList.get(i).toString());
 	Reporter.log(priceList.get(i).toString());
     }
     
   }
}


 


		
		
		
		