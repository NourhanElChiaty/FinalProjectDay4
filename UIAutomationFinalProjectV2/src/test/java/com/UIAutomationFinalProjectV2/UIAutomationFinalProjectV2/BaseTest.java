package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;



import io.github.bonigarcia.wdm.WebDriverManager;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	  PropertyFile prop = new PropertyFile();
	  
	  
  @BeforeClass
  public void beforeTest() throws IOException {
	  if(prop.getProperty("browserName").equals("chrome")) {
		  System.out.println(prop.getProperty("browserName"));
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		 // String URL =getProperty("baseURL");
		  
		  }
	  else if(prop.getProperty("browserName").equals("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  driver.navigate().to(prop.getProperty("baseURL"));
	  System.out.println(prop.getProperty("baseURL"));
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterTest() {
	  driver.quit();
 }

}
