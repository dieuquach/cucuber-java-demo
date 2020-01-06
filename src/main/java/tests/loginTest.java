package tests;

import runner.TestRunner;
import cucumber.api.java.en.Given;

/**
 * Created by nththuy on 12/31/19.
 */
public class loginTest extends TestRunner {
    @Given("Open website (.*)$")
    public void user_already_on_home_page(String website) {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }

}
