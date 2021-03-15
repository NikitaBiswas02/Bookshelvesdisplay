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
import com.ul.qa.pages.DisplayChairsPage;

public class ValidateChairDetails {
	WebDriver driver =null;
	  @BeforeClass(groups="Smoke Test")
	  public void initialiseSetUp() throws IOException {
      //This method is used to invoking driver
		  Properties prop = TestBase.setProperties();
		  driver=TestBase.driver();
		  driver.get(prop.getProperty("url"));
		  driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		  
	  }
	 @Test(priority = 1, groups=("Regression Test"))
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
		  
	 @Test(priority = 3,groups="Smoke Test" )
	//This method is use to call the 'searchBox' method
	  public void searchBoxTest() throws Exception {
		  DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		  homepage.searchBox("Study Chairs");
		  
	  }
	 @Test(priority = 4 ,groups="Smoke Test")
	//This method is use to call the 'clickOnSearchButton' method
	 public void searchButtonTest() throws InterruptedException {
		 DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		 homepage.clickOnSearchButton();
		 
	 }

	 @Test(priority = 5,groups="Smoke Test" )
	//This method is use to call the 'getChairsDetails' method
	 public void chairDetailsTest() throws InterruptedException {
		 DisplayChairsPage displaychairspage = new DisplayChairsPage(driver);
		  displaychairspage.getChairsDetails();
	 }
	 
	@AfterClass(groups="Smoke Test")
	//This method is used to quit the driver
	  public void tearDown() {
	  	  driver.quit();
	  }
	 
}
