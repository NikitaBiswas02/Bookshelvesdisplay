package com.ul.qa.base;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;



public class TestBase {
	
	
	
	protected static WebDriver driver;
	static String projectPath = System.getProperty("user.dir");
	
	
	public static WebDriver driver () {
		System.out.println("Choose Browser:\n 1.Chrome \n 2.Firefox");
		Scanner sc = new Scanner(System.in);
		String browser=sc.next();
		if(browser.equalsIgnoreCase("chrome"))
		{ //To launch in Chrome Browser
			System.setProperty("webdriver.chrome.driver","C://Users//HP//eclipse-workspace//DisplayBookShelves//drivers//chromedriver.exe");   
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) 
		{ //To launch in Firefox Browser
			System.setProperty("webdriver.gecko.driver","C://Users//HP//eclipse-workspace//DisplayBookShelves//drivers//geckodriver.exe");   
			driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("Browser not exist");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	
	public static Properties setProperties() throws IOException {
		Properties prop = new Properties();
		FileInputStream input = null;
		input = new FileInputStream(projectPath+"//src//main//java//com//ul//qa//config//config.properties");
		prop.load(input);
		
		return prop;
	}
	
	
	public void closeDriver()
	{
		driver.close();
	}
}
		
	


