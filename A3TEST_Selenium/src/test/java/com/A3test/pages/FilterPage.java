package com.A3test.pages;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import PageMethods.FlightClient;
import PageObjects.Homepageobjects;
import Utills.utiliesSelenium;
/*import cucumber.api.java.en.Then;*/

public class FilterPage extends TestBase {
	
	
	utiliesSelenium utill = new utiliesSelenium();
	public static Logger APPLICATION_LOGS = null;
	 public void user_clicks_on_pageScroll() throws Throwable {
		 try {
		Homepageobjects home = PageFactory.initElements(driver, Homepageobjects.class);
		 utill.waitelementVisibility(home.flightsFrom, 100);
		 utill. scrollPageEnd();
		 
		 //APPLICATION_LOGS.info("PageScroll donet to collect the List of flights");
		 }catch (Exception e) {
				//APPLICATION_LOGS.info(e+"failure at scroll the flight filter page");
				 System.out.println(e+"failure at sctoll the flight filter page");
			 }
	
	 }
	
	 
	 public void user_filterTheFilght_bookNOW() throws Throwable {
		 
		 FlightClient fclient = new FlightClient(driver);
         fclient.chooseFlight();
         
		}
}
