package com.Shanon.GenericLib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyListeners implements ITestListener{

	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
//		Reporter.log(result.getName()+" method started",true);
		test=extent.createTest(result.getName());
		test.info(MarkupHelper.createLabel(result.getName()+" method started", ExtentColor.BLUE));
	}

	public void onTestSuccess(ITestResult result) {
//		Reporter.log(result.getName()+" method PASSED",true);
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+" method PASSED", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
//		Reporter.log(result.getName()+" method FAILED",true);
		test=extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName()+" method FAILED", ExtentColor.RED));
		WebdriverCommonLib wlib=new WebdriverCommonLib();
		wlib.getScreenshot("./screenshots/"+result.getName()+".png");
	}

	public void onTestSkipped(ITestResult result) {
//		Reporter.log(result.getName()+" method SKIPPED",true);
		test=extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+" method SKIPPED", ExtentColor.ORANGE));
	}

	public void onStart(ITestContext context) {
//		Reporter.log(context.getName()+" started",true);
		spark=new ExtentSparkReporter(IAutoConsts.EXTENT_REPORT_PATH);
		spark.config().setDocumentTitle("ShanonCRM");
		spark.config().setReportName("Extent Reports");
		spark.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(spark);
	}

	public void onFinish(ITestContext context) {
//		Reporter.log(context.getName()+" ended",true);
		
		extent.flush();
	}

	
	
}
