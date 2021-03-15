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
import com.ul.qa.pages.GiftCardPage;

public class ValidateGiftCardEntry {
	WebDriver driver = null;
	 @BeforeClass(groups="Smoke Test")
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
	  @Test(priority = 2 ,groups="Smoke Test")
	//This method is use to call the 'closePopup' method
	  public void closePopUpTest() throws Exception {
		  DisplayBookShelvesPage homepage = new DisplayBookShelvesPage(driver);
		  homepage.closePopup();
	  }
	  
	  @Test(priority = 3,groups="Smoke Test" )
	  //This method is use to call the 'clickOnGiftCard' method
	  public void GiftCardButtonTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.clickOnGiftCard();
	  }
	  @Test(priority = 4 ,groups="Smoke Test")
	  //This method is use to call the 'selectCard' method
	  public void selectCardTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.selectCard();
	  }
	  @Test(priority = 5 ,groups="Smoke Test")
	//This method is use to call the 'setAmount' method
	  public void AmountTextBoxTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.setAmount();
	  }
	  @Test(priority = 6 ,groups="Smoke Test")
	  //This method is use to call the 'enterRecipientName' method
	  public void RecipientNameTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.enterRecipientName();
	  }
	  @Test(priority = 7,groups="Smoke Test" )
	  //This method is use to call the 'enterRecipientEmail' method
	  public void RecipientEmailTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.enterRecipientEmail();
	  }
	  @Test(priority = 8,groups="Smoke Test" )
	//This method is use to call the 'enterSenderName' method
	  public void senderNameTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.enterSenderName();
	  }
	  @Test(priority = 9 ,groups="Smoke Test")
	//This method is use to call the 'enterSenderNo' method
	  public void senderNoTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.enterSenderNo();
	  }
	  @Test(priority = 10,groups="Smoke Test" )
	//This method is use to call the 'displayErrorMessage' method
	  public void errorMessageTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.displayErrorMessage();
	  }
	  
	  @Test(priority = 11 ,groups="Smoke Test")
	//This method is use to call the 'takeScreenShot' method
	  public void screenShotTest() throws Exception {
		   
		   GiftCardPage giftcardpage = new GiftCardPage(driver);
		   giftcardpage.takeScreenShot();
	  }
	  @AfterClass(groups="Smoke Test")
	  //This method is use for quit the driver
	  public void tearDown() {
	  	  driver.quit();
	  }
	  
}
