package FunctionalTests.Testcases;

/**
 * Created by vishal on 9/9/16.
 */

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features={"classpath:Features/"},
        format = { "pretty", "html:target/cucumber",
        "json:target/cucumber.json" }, tags = { "@RegressionTests" })
public class RunCukesTest {

}