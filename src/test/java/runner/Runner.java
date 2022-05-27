package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        monochrome = true,
        tags = "@Marto"
)

public class Runner {

        @AfterClass
        public static void cleanDriver(){
            BasePage.closeBrowser();
    
        }
}
