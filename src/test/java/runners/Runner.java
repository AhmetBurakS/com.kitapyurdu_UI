package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin= {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "junit:target/xml-report/cucumber.xml"},
        features = {"src/test/resources/Features"},
        glue = "stepDefinitions",
        tags = "@smoke",

        dryRun = false

)

public class Runner {

}

