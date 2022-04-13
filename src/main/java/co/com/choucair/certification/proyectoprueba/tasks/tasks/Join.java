package co.com.choucair.certification.proyectoprueba.tasks.tasks;

import co.com.choucair.certification.proyectoprueba.tasks.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Join implements Task {
    public static Join onThePage() {
        return Tasks.instrumented(Join.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoinPage.JOIN_BUTTON));
    }
}
