@Ciclo1
Feature: Verificar funcionalidad de registro de Solicitante

  Scenario: Validar registro de Solicitante
    Given Abrir safari web solicitante
    And Ir al registro del Solicitante
    When Completar el formulario de registro del solicitante
    Then hacer click en boton registrar solicitante