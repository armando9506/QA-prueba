package co.com.choucair.certification.proyectoprueba.tasks.tasks;

import co.com.choucair.certification.proyectoprueba.tasks.userinterface.FillForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;



public class Form implements Task {


    public static Form the() {
        return Tasks.instrumented(Form.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Armando").into(FillForm.INPUT_FIRSTNAME),
                Enter.theValue("Perez").into(FillForm.INPUT_LASTNAME),
                Enter.theValue("Armando@gmail.com").into(FillForm.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(FillForm.INPUT_BIRTHMONTH),
                SelectFromOptions.byVisibleText("15").from(FillForm.INPUT_BIRTHDAY),
                SelectFromOptions.byVisibleText("1995").from(FillForm.INPUT_BIRTHYEAR),
                Enter.theValue("Spanish").into(FillForm.INPUT_LANGUAGES),
                Click.on(FillForm.INPUT_LOCATION),

                Enter.theValue("Sincelejo Sucre, Colombia").into(FillForm.INPUT_CITY),
                Hit.the(Keys.DOWN).into(FillForm.INPUT_CITY),
                Hit.the(Keys.ENTER).into(FillForm.INPUT_CITY),
               Enter.theValue("700001").into(FillForm.INPUT_ZIP),
                       Click.on(FillForm.INPUT_DEVICES),


                Click.on(FillForm.INPUT_LAST_STEP),

                Enter.theValue("Utest.com/signup/complete1").into(FillForm.INPUT_PASSWORD),
                Enter.theValue("Utest.com/signup/complete1").into(FillForm.INPUT_CONFIRM_PASSWORD),
                Click.on(FillForm.CHECK_1),
                Click.on(FillForm.CHECK_2),
                Click.on(FillForm.BUTTON_COMPLETE_SETUP)
        );

    }


}
