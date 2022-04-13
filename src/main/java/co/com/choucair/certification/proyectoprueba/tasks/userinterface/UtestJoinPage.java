package co.com.choucair.certification.proyectoprueba.tasks.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestJoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the registration form")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
}
