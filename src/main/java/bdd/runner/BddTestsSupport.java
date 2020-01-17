package bdd.runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.domrf.bdd.atcore.runner.Runner;


@RunWith(Runner.class)
@CucumberOptions(
        monochrome = true,
        format = {"pretty"},
        features = "classpath:features/",
        glue = {"ru.domrf.bdd.atcore.stepdefs", "ru.bdd.stepdefs"},
        plugin = "ru.domrf.bdd.atcore.allure.AllureCucumber2Jvm",
        strict = true

)
public class BddTestsSupport {
}
