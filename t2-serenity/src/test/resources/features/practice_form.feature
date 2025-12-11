Feature: Practice Form
  Como usuario del formulario de practicas
  Quiero registrar infromacion personal correctamente
  Para validar el funcionamiento del formulario

  Scenario: Registro exitoso con campos obligatorios
    Given que navego al formulario de practica
    When ingreso el nombre "Luisa" y el apellido "Piedra"
    And ingreso el email "piedra@gmail.com"
    And selecciono el genero female
    And ingreso el numero "9149159163"
    And selecciono el hobby "Sports"
    And ingreso la direccion "Av . Los precursores"
    And hago click en Submit
    Then debe aparecer el modal de confirmacion

  Scenario: Registro con campos adicionales
    Given que navego al formulario de practica
    When ingreso el nombre "Maria" y el apellido "Quispe"
    And ingreso el email "majito@gmail.com"
    And selecciono el genero female
    And ingreso el numero "9149159169"
    And selecciono el hobby "Reading"
    And ingreso la direccion "Los caimanes"
    And hago click en Submit
    Then debe aparecer el modal de confirmacion

  Scenario: Validacion de formulario incompleto
    Given que navego al formulario de practica
    When ingreso el nombre "" y el apellido ""
    And ingreso el email ""
    And hago click en Submit
