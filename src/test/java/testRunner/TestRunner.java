package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="File",glue= {"stepDefinition"},plugin= {"pretty","json:target/cucumber.json"})
public class TestRunner {

}
