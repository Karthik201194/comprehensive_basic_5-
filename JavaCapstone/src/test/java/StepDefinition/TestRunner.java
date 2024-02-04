package StepDefinition;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="C:\\Users\\manuv\\eclipse-workspace\\JavaCapstone\\src\\test\\resources\\Feature\\logn.feature",
glue={"StepDefinition"},
monochrome = true,
plugin = { "pretty", "html:target/reports"})
public class TestRunner {
	  public static void main(String[] args) {
	        JUnitCore.main("StepDefinition.TestRunner");
	  }

}
