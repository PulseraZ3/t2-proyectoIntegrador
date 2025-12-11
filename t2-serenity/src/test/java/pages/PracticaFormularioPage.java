package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PracticaFormularioPage extends PageObject {

    private By firstName = By.id("firstName");
    private By lastName  = By.id("lastName");
    private By email     = By.id("userEmail");
    private By gender    = By.cssSelector("label[for='gender-radio-1']");
    private By mobile    = By.id("userNumber");
    private By address   = By.id("currentAddress");
    private By submitBtn = By.id("submit");

    public void escribirNombre(String value){
        find(firstName).sendKeys(value);
    }

    public void escribirApellido(String value){
        find(lastName).sendKeys(value);
    }

    public void escribirEmail(String value){
        find(email).sendKeys(value);
    }

    public void seleccionarGenero(){
        find(gender).click();
    }

    public void escribirCelular(String value){
        find(mobile).sendKeys(value);
    }

    public void escribirDireccion(String value){
        find(address).sendKeys(value);
    }

    public void clickSubmit(){
        evaluateJavascript("arguments[0].scrollIntoView(true);", find(submitBtn));
        find(submitBtn).click();
    }
    public void seleccionarHobby(String hobbyName){
        By hobby = By.xpath("//label[text()='" + hobbyName + "']");
        find(hobby).click();
    }
}
