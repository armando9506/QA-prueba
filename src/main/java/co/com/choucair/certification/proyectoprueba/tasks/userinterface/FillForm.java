package co.com.choucair.certification.proyectoprueba.tasks.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FillForm extends PageObject {

    public static final Target  INPUT_FIRSTNAME =Target.the("where we write the first name").located(By.id("firstName"));
    public static final Target  INPUT_LASTNAME =Target.the("where we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we write the email").located(By.id("email"));
    public static final Target  INPUT_BIRTHMONTH =Target.the("where we write the birth month").located(By.id("birthMonth"));
    public static final Target  INPUT_BIRTHDAY =Target.the("where we write the birth day").located(By.id("birthDay"));
    public static final Target INPUT_BIRTHYEAR = Target.the("where we write the birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("where we write the languages").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target INPUT_LOCATION = Target.the("Button to Location").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));



    public static final Target  INPUT_CITY =Target.the("where we write the city").located(By.id("city"));
    public static final Target  INPUT_ZIP =Target.the("where we write the postal code").located(By.id("zip"));
    public static final Target  INPUT_DEVICES =Target.the("where we write the country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target  INPUT_LAST_STEP =Target.the("where we write the country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target  INPUT_PASSWORD =Target.the("where we write the password").
            located(By.id("password"));
    public static final Target  INPUT_CONFIRM_PASSWORD =Target.the("where we write the confirmPassword").
            located(By.id("confirmPassword"));


    public static final Target  CHECK_1 =Target.the("check confirm").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label"));
    public static final Target  CHECK_2 =Target.the("heck confirm").
            located(By.id("privacySetting"));


    public static final Target  BUTTON_COMPLETE_SETUP =Target.the("Buton confirm").
            located(By.id("laddaBtn"));

}
