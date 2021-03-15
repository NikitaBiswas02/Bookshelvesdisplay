package com.ul.qa.testcases;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ul.qa.base.TestBase;
import com.ul.qa.pages.DisplayBookShelvesPage;

public class ValidateBookDetails extends TestBase{
	 WebDriver driver = null;
	 @BeforeClass(groups = "Smoke Test")
	
	 //This method is used to invoking driver
	 public void initialiseSetUp() throws IOException {
		  Properties prop = TestBase.setProperties();
		  driver=TestBase.driver();
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		  
	  }
	 @Test(priority = 1,groups="Regression Test")
	 //This method is use to call the 'validateHomePageTitle' method
	  public void homePageTitleTest() throws Exception {
		   DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		 //Use of Assert Function 
		 String title=homepage.validateHomePageTitle();
		 Assert.assertEquals(title, "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
		   
	  }
	  @Test(priority = 2,groups="Smoke Test")//This method is use to call the 'closePopup' method
	  
	  public void closePopUpTest() throws Exception {
		  DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		  homepage.closePopup();
	  }
		  
	 @Test(priority = 3,groups="Smoke Test")
	 //This method is use to call the 'searchBox' method
	  public void searchBoxTest() throws Exception {
		  DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		  homepage.searchBox("BookShelves");
		  
	  }
	 @Test(priority = 4,groups="Smoke Test")
	 //This method is use to call the 'clickOnSearchButton' method
	 public void searchButtonTest() throws InterruptedException {
		 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		 homepage.clickOnSearchButton();
		 
	 }
	 @Test(priority = 5,groups="Smoke Test")
	 //This method is use to call the 'setCategory' method
	 public void categoryTest() throws InterruptedException {
		 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		 homepage.setCategory();
	 }
		 @Test(priority = 6,groups="Smoke Test")
		//This method is use to call the 'setStorageType' method
		 public void storageTypeTest() throws InterruptedException {
			 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
			 homepage.setStorageType();
		 
	 }
		 @Test(priority = 7,groups="Smoke Test")
		 //This method is use to call the 'clickOutOfStock' method
		 public void outOfStockTest() throws InterruptedException {
			 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
			 homepage.clickOutOfStock();
		 }
		 @Test(priority = 8,groups="Smoke Test")
		 //This method is use to call the 'setRecommandation' method
		 public void RecommandationTest() throws InterruptedException {
			 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
			 homepage.setRecommandation();
		 }
		 @Test(priority = 9,groups="Smoke Test")
		 //This method is use to call the 'getBookDetails' method
		 public void bookDetailsTest() throws InterruptedException {
			 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
			 homepage.getBookDetails();
	 
         }
		 @AfterClass(groups="Smoke Test")
		 //This method is use to quit the driver
		  public void tearDown() {
		  	  driver.quit();
		  }
		  


}
