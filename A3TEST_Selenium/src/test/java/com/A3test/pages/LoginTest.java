package com.A3test.pages;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import PageObjects.Homepageobjects;
import Utills.TestUtil;
import Utills.utiliesSelenium;


@Listeners(com.A3test.pages.Listener.class)

public class LoginTest extends TestBase {
	
	utiliesSelenium utill = new utiliesSelenium();
	public static Logger APPLICATION_LOGS = null;

	  @DataProvider(name="DataSheetProvider")
	public Object[][] getLoginData() throws IOException{
		return TestUtil.getData("LoginSheet", null);
		//return null;
	}
	  
	@Test 
	 public void title_of_login_page_is_free_CRM(){
		 String title = driver.getTitle();
		 System.out.println(title);
		 APPLICATION_LOGS.info("Titel validation");
		  //Assert.as("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday", title);
		 }
	 
	@Test
	 public void user_1enters_sourceDestination_and(String FromCity, String ToCity, String loginPhoneNumber) throws Throwable {
	
		 System.out.println("enter page");
		 
	}
	//@Test(dataProvider="DataSheetProvider")
	 public void user_enters_sourceDestination_and() throws Throwable {
		 try {
		 System.out.println("enter page");
		 Homepageobjects home = PageFactory.initElements(driver, Homepageobjects.class);
		 
		 utill.waitelement(home.from);
		 Thread.sleep(2000);
		//static wait required 
		 try {
		 home.from.click();
		 
		 }catch (Exception e) {
			 try {
				 System.out.println("enter login page");
				 loginentries("9441658058",home);
				 Thread.sleep(50000);
			 }catch (Exception e1) {} 
			 utill.waitelement(home.from);
			 home.from.click();
			 driver.navigate().refresh();
		}
		 
		 int noOfPlaces=home.places.size();
		 for(int i=1;i<=noOfPlaces;i++) {
			if( driver.findElement(By.xpath(home.placesSet.replace("INDEX", String.valueOf(i)))).getText().contains("Hyderabad")) {
				driver.findElement(By.xpath(home.placesSet.replace("INDEX", String.valueOf(i)))).click();
				break;
			}
		 }
		 Thread.sleep(2000);
		 for(int i=1;i<=noOfPlaces;i++) {
				if( driver.findElement(By.xpath(home.placesSet.replace("INDEX", String.valueOf(i)))).getText().contains("Pune")) {
					driver.findElement(By.xpath(home.placesSet.replace("INDEX", String.valueOf(i)))).click();
					break;
				}
			 }
		 //APPLICATION_LOGS.info("TO filed enterd and validation");
		 Thread.sleep(2000);
		 home.date.click();
		 home.search.click();
		 //APPLICATION_LOGS.info("Search Started--");
		 }catch (Exception e) {
			//APPLICATION_LOGS.info(e+"failure at From to selection fields");
			 System.out.println(e+"failure at From to selection fields");
		 }

}
	 
	 
	 
	 
	 
	 public void loginentries(String loginPhoneNumber, Homepageobjects home) throws InterruptedException {
		 //Homepageobjects home = PageFactory.initElements(driver, Homepageobjects.class);
		 try {
			home.login.click();
			home.userid.sendKeys(loginPhoneNumber);
			home.continue1.click();
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			javascript.executeScript("alert('Enter otp or else tap on webpage for closeb the login promt');");
			Thread.sleep(20000);
			WebDriverWait wait = new WebDriverWait(driver, 500);
            wait.until(ExpectedConditions.elementToBeClickable(home.loginbutton));
			home.loginbutton.click();
		 }catch (Exception e) {
			APPLICATION_LOGS.info(e+"failure at login page");
			 System.out.println(e+"failure at login page");
		 }
			
		}
	 
}
