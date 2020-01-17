package runner;

import bdd.runner.BddTestsSupport;
import org.junit.AfterClass;
import static ru.domrf.bdd.atcore.environment.Init.closeDriver;
public class CucumberRunnerTest extends BddTestsSupport {

    @AfterClass
    public static void tearDown() {
        closeDriver();
    }
}
