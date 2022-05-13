package com.sample.manoj123;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "features\\logout.feature",glue = "com.sample.manoj123", plugin = "html:reports.html")

//@CucumberOptions(features = "features\\logout.feature",glue = "com.sample.manoj123", plugin = "html: testng.xml")

		
   public class TestRunner extends AbstractTestNGCucumberTests   {
	
	
}
