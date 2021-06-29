@Ciclo1
Feature: Validar la funcionalidad de registro de Prestador

  Scenario: Validar registro de Prestador
    Given Abrir safari prestador
    And Ir al registro del Prestador
		When Completar el formulario de registro del prestador
    Then click en boton registrar prestador
