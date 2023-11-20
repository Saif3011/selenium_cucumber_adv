@authentification
Feature: Je souhaite verifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite verifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And je saisis le password "admin"
    And je clique sur le boutton Log In
    Then je me redirige vers la page home "Dashboard"

  @invalid
  Scenario: Je souhaite verifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin1@yourstore.com"
    And je saisis le password "test"
    And je clique sur le boutton Log In
    Then Je verifie le message d erreur "Login was unsuccessful.Please correct the errors and try again.No customer account found"

  @logOut
  Scenario: Je souhaite se deconnecter de la page de connexion
    When Je clique sur le boutton Log Out
