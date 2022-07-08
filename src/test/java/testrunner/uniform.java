package testrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		   features = "src/test/java/feature",
	        glue ={"stepdefinition"},
	        monochrome = true,//proper allign
	        		dryRun = false,
	        		tags={"@nani"},  //And condition
	        		//tags={"@nani,@babu"},  //OR condition
	        		//tags={"~@nani"},  //skipping tag
	        		//plugin = {"pretty"}
	                plugin = {"pretty","html:Reports","json:Reports/jsonreport.json","junit:Reports/xmlreport.xml" }
	        		
		   )
public class uniform {

}
