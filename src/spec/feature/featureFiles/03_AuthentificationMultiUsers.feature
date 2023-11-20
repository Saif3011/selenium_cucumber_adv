@multiusers
Feature: Je souhaite vérifier la connexion avec plusieurs utilisateurs
  ETQ Je souhaite vérifier la connexion avec plusieurs utilisateurs
  Background: 
    Given Je me connecte sur l application nopCommerce

  @authentificationMultiusers
  Scenario Outline: Je souhaite vérifier la connexion avec plusieurs utilisateurs
    When Je saisis l email "<name>"
    And je saisis le password "<value>"
    And je clique sur le boutton Log In

    Examples: 
      | name                 | value       | 
      | admin@yourstore.com  |     admin    |
      | saif@yourstore.com   |     saif       | 
      | ahmed@yourstore.com   |     ahmed       | 
