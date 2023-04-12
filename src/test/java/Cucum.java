import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:\\Users\\Pavan.Kopparapu\\Downloads\\QAprojects\\SerenityGradle\\src\\test\\resources\\Feature", glue = "StepDefinition")
public class Cucum {
}
