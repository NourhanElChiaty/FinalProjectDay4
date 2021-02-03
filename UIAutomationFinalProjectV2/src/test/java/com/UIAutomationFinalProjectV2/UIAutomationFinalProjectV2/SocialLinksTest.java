package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;



import java.util.ArrayList;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SocialLinksTest extends BaseTest {
	@Test
	public void Test() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		SocialLinks link = new SocialLinks(driver);
		SoftAssert soft = new SoftAssert();
		
		wait.until(ExpectedConditions.visibilityOf(link.facebookLink())).click();
		wait.until(ExpectedConditions.visibilityOf(link.twitterLink())).click();
		wait.until(ExpectedConditions.visibilityOf(link.youTubeLink())).click();
		wait.until(ExpectedConditions.visibilityOf(link.RSSLink())).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(3));
		
		soft.assertTrue(driver.getCurrentUrl().equals("http://www.facebook.com/nopCommerce"));
		Reporter.log("Expected Result is: http://www.facebook.com/nopCommerce. And the Actual Result is:"
				+ driver.getCurrentUrl() + "\n");

		driver.close();

		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(2));
		soft.assertTrue(driver.getCurrentUrl().equals("http://twitter.com/nopCommerce"));
		Reporter.log("Expected Result is: http://twitter.com/nopCommerce. And the Actual Result is:"
				+ driver.getCurrentUrl() + "\n");

		driver.close();

		driver.switchTo().window(tabs.get(1));
		soft.assertTrue(driver.getCurrentUrl().equals("https://www.youtube.com/user/nopCommerce"));
		Reporter.log("Expected Result is: https://www.youtube.com/user/nopCommerce. And the Actual Result is:"
				+ driver.getCurrentUrl() + "\n");

		driver.close();
		//Thread.sleep(2000);
		//driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);

		soft.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/news/rss/1"));
		Reporter.log("Expected Result is: https://demo.nopcommerce.com/news/rss/1. And the Actual Result is:"
				+ driver.getCurrentUrl() + "\n");

		//driver.close();
		soft.assertAll();
	}
}
