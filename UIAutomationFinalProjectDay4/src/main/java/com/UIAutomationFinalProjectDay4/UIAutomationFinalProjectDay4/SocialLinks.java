package com.UIAutomationFinalProjectDay4.UIAutomationFinalProjectDay4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SocialLinks extends PageBase{

	public SocialLinks(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement facebookLink() {
		
		WebElement facebook =driver.findElement(By.xpath("//li[@class=\"facebook\"]/a"));
		return facebook;
	}
	
public WebElement twitterLink() {
		
		WebElement twitter =driver.findElement(By.xpath("//li[@class=\"twitter\"]/a"));
		return twitter;
	}
public WebElement RSSLink() {
	
	WebElement rss =driver.findElement(By.xpath("//li[@class=\"rss\"]/a"));
	return rss;
}
public WebElement youTubeLink() {
	
	WebElement youTube =driver.findElement(By.xpath("//li[@class=\"youtube\"]/a"));
	return youTube;
}
}
