package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/example2.Feature",
                  glue="stepdefinition",
                 plugin="html:C:\\cucumber\\cucumber-html-report",
                tags={"@category,@product-name"})




public class RunnerClass2 {

}
