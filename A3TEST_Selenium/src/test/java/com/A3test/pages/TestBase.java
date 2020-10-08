package com.A3test.pages;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageMethods.BrowserSettings;

public class TestBase extends BrowserSettings {
	WebDriver driver1=driver ;
	@BeforeClass
	public void userLOgin() throws Throwable {
	     initConfig();
		initBrowser();
		invokeApplication();
		//APPLICATION_LOGS.info("Browser lanched with URL");
	 }
	
	@AfterClass
	 public void close_the_browser(){
		 driver.quit();
		 //APPLICATION_LOGS.info("Close the browser");
	 }
	
	
	public static String filePath = System.getProperty("user.dir")
			+ "\\ScreenShots";
    public void takeScreenShot(String methodName) {
   	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name 
           try {
				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
   }
}
