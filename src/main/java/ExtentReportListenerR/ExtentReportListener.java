package ExtentReportListenerR;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ExtentReportListener{
	private static ExtentReports extent;

	

	public static ExtentReports getInstance(String fileName)
	{
		
		if (extent ==null) {
			
			extent = new ExtentReports(fileName,true,DisplayOrder.NEWEST_FIRST);
			
			//Loading the configuration file for the report
			
			extent.loadConfig(new File(System.getProperty("user dir") +  "//reportConfig.xml"));
					
			//Adding the system information in the reports
					
					extent.addSystemInfo("Appium","1.18.0").addSystemInfo("Environment","QA");
		}
		 return extent;
		
	}
	

}
	