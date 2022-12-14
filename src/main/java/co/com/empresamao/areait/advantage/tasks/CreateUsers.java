package co.com.empresamao.areait.advantage.tasks;

import co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage;
import co.com.empresamao.areait.advantage.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.empresamao.areait.advantage.userinterfaces.HomePage.*;
import static co.com.empresamao.areait.advantage.userinterfaces.CreateUserPage.*;
public class CreateUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ICN_MENU_USER,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(ICN_MENU_USER),
                WaitUntil.the(LBL_CREATE_NEW_ACCOUNT,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LBL_CREATE_NEW_ACCOUNT),
                WaitUntil.the(TXT_USER_NAME,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("Eli9815").into(TXT_USER_NAME),
                Enter.theValue("eli8@gmail.com").into(TXT_USER_EMAIL),
                Enter.theValue("E1234t.").into(TXT_PASSWORD),
                Enter.theValue("E1234t.").into(TXT_CONFIRM_PASSWORD),
                Enter.theValue("Eliana").into(TXT_FIRST_NAME),
                Enter.theValue("Torres").into(TXT_LAST_NAME),
                Enter.theValue("32334456").into(TXT_PHONE_NUMBER),
                Enter.theValue("").into(),
                Enter.theValue("Medellin").into(TXT_CITY),
                Enter.theValue("cll 21").into(TXT_ADDRESS),
                Enter.theValue("antioquia").into(TXT_STATE),
                Enter.theValue("05665").into(TXT_POSTAL_CODE),
                Click.on(CHK_I_AGREE),
                Click.on(BTN_REGISTER)

        );
    }
    public static CreateUsers createUsers(){
       return instrumented(CreateUsers.class);
    }
}
