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
import com.ul.qa.pages.CollectionSubMenuPage;
import com.ul.qa.pages.DisplayBookShelvesPage;

public class ValidateSubMenu {
	 WebDriver driver = null;
	 @	BeforeClass(groups="Smoke Test")
	  public void initialiseSetUp() throws IOException {
		//This method is used to invoking driver
		  Properties prop = TestBase.setProperties();
		  driver=TestBase.driver();
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		  
	  }
	 @Test(priority = 1,groups="Regression Test" )
	//This method is use to call the 'validateHomePageTitle' method
	  public void homePageTitleTest() throws Exception {
		   DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		 //Use of Assert Function
		   String title=homepage.validateHomePageTitle();
			 Assert.assertEquals(title, "Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
		  }
	 
	 @Test(priority = 2,groups="Smoke Test")
	//This method is use to call the 'closePopup' method
	  public void closePopUpTest() throws Exception {
		  DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		  homepage.closePopup();
	 }
	 
	 @Test(priority = 3,groups="Smoke Test")
	//This method is use to call the 'clickOnCollection' method
	 public void CollectionButtonTest() throws InterruptedException {
		 CollectionSubMenuPage collectionsubmenupage = new CollectionSubMenuPage(driver);
		 collectionsubmenupage.clickOnCollection();
		
		 
	 }
	 
	 @Test(priority = 4,groups="Smoke Test")
	//This method is use to call the 'displaySubmenu' method
	 public void subMenuTest() throws Exception {
		 CollectionSubMenuPage collectionsubmenupage = new CollectionSubMenuPage(driver);
		 collectionsubmenupage.displaySubmenu();
		 
	 }
	 
	 @AfterClass(groups="Smoke Test")
	 //This method is use to quit the driver
	  public void tearDown() {
	  	  driver.quit();
	  }
	 
}
