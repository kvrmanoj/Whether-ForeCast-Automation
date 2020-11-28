package testconfigurations;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"Pretty","html:target/cucumberHtmlReport"
		},
		glue= {"testconfigurations"},
		features="classpath:Features"
		
		)
public class Runner {

}