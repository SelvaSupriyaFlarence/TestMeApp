package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/example5.feature",
                  glue="stepdefinition")
               //  plugin="html:C:\\cucumber\\cucumber-html-report")
                 




public class RunnerClass3 {

}
