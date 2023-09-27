package StepDefinitionsOtmane;

import Utilities.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksOtmane {

    @Before // Runs before each scenario
    public void beforeScenario(){
        System.out.println("Scenario is starting");
    }

    @After // Runs after each scenario
    public void afterScenario(Scenario scenario)  {
        System.out.println("Scenario has ended");
        DriverClass.quitDriver();
    }
}
