package steps;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PracticaFormularioPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PracticaFormularioSteps {

    @Managed
    WebDriver driver;

    @Steps
    PracticaFormularioPage page;

    @Given("que navego al formulario de practica")
    public void navegarFormulario() {
        page.openUrl("https://demoqa.com/automation-practice-form");
    }

    @When("ingreso el nombre {string} y el apellido {string}")
    public void ingresarNombres(String nombre, String apellido){
        page.escribirNombre(nombre);
        page.escribirApellido(apellido);
    }

    @And("ingreso el email {string}")
    public void ingresarEmail(String email){
        page.escribirEmail(email);
    }

    @And("selecciono el genero female")
    public void seleccionarGenero(){
        page.seleccionarGenero();
    }

    @And("ingreso el numero {string}")
    public void ingresarNumero(String numero){
        page.escribirCelular(numero);
    }

    @And("selecciono el hobby {string}")
    public void seleccionarHobby(String hobby){
        page.seleccionarHobby(hobby);
    }

    @And("ingreso la direccion {string}")
    public void ingresarDireccion(String dir){
        page.escribirDireccion(dir);
    }

    @And("hago click en Submit")
    public void hacerClick(){
        page.clickSubmit();
    }

    @Then("debe aparecer el modal de confirmacion")
    public void validarModal(){
        assertTrue(page.getDriver().getPageSource().contains("Thanks for submitting the form"));
    }

}
