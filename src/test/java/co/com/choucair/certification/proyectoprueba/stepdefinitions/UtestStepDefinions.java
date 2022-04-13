package co.com.choucair.certification.proyectoprueba.stepdefinitions;

import co.com.choucair.certification.proyectoprueba.tasks.tasks.Form;
import co.com.choucair.certification.proyectoprueba.tasks.tasks.Join;
import co.com.choucair.certification.proyectoprueba.tasks.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Armando wants to create a user account en Utest\\.com$")
    public void thanArmandoWantsToCreateAUserAccountEnUtestCom() {
        OnStage.theActorCalled("Armando").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }


    @When("^he looks for the Utest registration form$")
    public void heLooksForTheUtestRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Form.the());
    }

    @Then("^he creates the user account in Utest$")
    public void heCreatesTheUserAccountInUtest() {

    }
}
