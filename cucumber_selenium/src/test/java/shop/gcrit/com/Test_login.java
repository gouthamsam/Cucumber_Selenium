package shop.gcrit.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features={"src\\test\\resources\\com\\test\\gcritlogin.feature"},
glue={"stepDefinition"}

)
@RunWith(Cucumber.class)
public class Test_login {
}
