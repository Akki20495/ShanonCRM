package com.Shanon.GenericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports {
	static ExtentSparkReporter spark;
	static ExtentReports extent;
	static ExtentTest test;
	public static void main(String[] args) {
		 spark=new ExtentSparkReporter("./customreport.html");
		 spark.config().setDocumentTitle("Shanon CRM");
		 spark.config().setReportName("Extent Reports_5");
		 spark.config().setTheme(Theme.DARK);
		 extent = new ExtentReports();
		extent.attachReporter(spark);
		test = extent.createTest("Create New Customer");
		test.pass(MarkupHelper.createLabel(" element is Displayed,PASS ", ExtentColor.GREEN));
		test.skip(MarkupHelper.createLabel(" element is Displayed,PASS ", ExtentColor.ORANGE));
		test.fail(MarkupHelper.createLabel(" element is Displayed,PASS ", ExtentColor.RED));	
		extent.flush();
	}
	
	
	
}
