Feature: Login

  
  Scenario Outline: Login
    Given clicamos no botão login
    When preenchermos os campos <pass>
    And clicar no botao login

    Examples: 
      | pass|
      |"1234" |
      |"123456789" |
