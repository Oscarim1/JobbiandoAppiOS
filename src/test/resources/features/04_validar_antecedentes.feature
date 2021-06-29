@Ciclo1
Feature: Verificar la funcionalidad de validar antecedentes

  Scenario: Validar Antecedentes
    Given Abrir el navegador
    And Ir a revisar antecedentes
		When Seleccionar al usuario al que se le validaran los antecedentes
    And hacer click en validar antecedentes
    Then Salir del navegador