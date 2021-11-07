package ec.edu.espol.workshops;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumOptions(
        plugin = {"pretty","html: build/reports/cucumber-report.html"},
        monochrome = true)
public class Runner{
}