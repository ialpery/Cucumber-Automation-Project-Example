package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports.html",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,     // true iken feature icinde yazılmıs ama kodlari olusturulmamis adımlari calistirir. false olursa hepsini calistirmaya calisir
        tags = "@so"   // featurelardaki taglara göre çalıştırmamızı sağlar

)
public class Runner {



}
