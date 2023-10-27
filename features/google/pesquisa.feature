
Feature: Pesquisa Google

  Scenario: Pesquisa Google
    Given abro o navegador na página do google
    When digito na barra de pesquisa
    And clico no botao pesquisar
    Then realiza a pesquisa
