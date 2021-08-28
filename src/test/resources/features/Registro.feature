#Proyecto de pruebas y cargado en Github
#21/08/2021
#Jefferson Parra Ariza
@Regresion
Feature: ingreso orange

  @Caso1
  Scenario Outline: ingreso orange1
    Given abrir el navegador
    When ingrese el username <userName> y el password <passWord>

    Examples: 
      | userName | passWord |
      | Admin    | admin123 |

  @Caso2
  Scenario Outline: ingreso orange2
    Given abrir el navegador
    When ingrese el username <userName> y el password <passWord>
    And acceder a la opcion add employee
    Then diligenciar los campos first name <firstName> y last name <lastName>

    Examples: 
      | userName | passWord | firstName       | lastName |
      | Admin    | admin123 | JeffersonAndres | Parra    |
