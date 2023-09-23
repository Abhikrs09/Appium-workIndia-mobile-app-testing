package Runner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;


	
	@CucumberOptions(features = "src/test/java/Features", glue = { "StepDefinitions" },
			
			// path of step definition
			plugin = { "pretty"}, monochrome = true, dryRun = false,
			
			// check all the steps have the
																				
			strict = true, // check if any step is not defined in step definition file
			tags = { "@TestStart,@TestEnd" })


			@Test
			public class RunnerForAndroid extends AbstractTestNGCucumberTests {
				public static AppiumDriverLocalService service;
				public BaseClass base;
			@BeforeSuite
			public void startAppium() {
			//start Appium Server
				
				
				service = AppiumDriverLocalService.buildDefaultService();
				service.start();
				
	
				
					DesiredCapabilities capabilities= new DesiredCapabilities();
					
					
					capabilities.setCapability("udid","emulator-5554");
					capabilities.setCapability("platformName", "Android");
					capabilities.setCapability("platformVersion", "10.0");
					capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
					capabilities.setCapability("appActivity", ".RegisterActivity");
					capabilities.setCapability("deviceName", "Android");
				    capabilities.setCapability("app", "app\\in.workindia.apk");
				    
				    try 
					{
						
						URL url=new URL("http://127.0.0.0:4723/wd/hub");
					    base.driver=new AppiumDriver<MobileElement>(url,capabilities);
						base.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
						
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					
					
					}
	
	
			@AfterSuite
			public void stopAppium() {
				
			//stop Appium
				service.stop();
			}

			}

