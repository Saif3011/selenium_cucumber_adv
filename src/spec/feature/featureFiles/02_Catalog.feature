@catalog
Feature: Verify Catalog functionnality

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le boutton Log In
    Then Je me redirige vers la page home "Dashboard"
    When Je click sur le boutton catalog

  @product
  Scenario: Je souhaite vérifier l existance d un produit
    And Je click sur le boutton Product
    And Je saisie le nom du produit recherché "Asus" dans le champ Product Name
    And Je clique sur le boutton Search
    Then Le produit recherché est affiché avec détails

  @categories
  Scenario: Je souhaite ajouter un nouveau categorie
    When Je clique sur le boutton Categories
    And Je clique sur le boutton Add new
    And Je saisie sur le nom "test" et la description "test1"
    And Je selectionne la categorie parent
    And Je telecharge l image
    And Je clique sur le boutton Save
    Then Le nom de la categorie sera affiche dans la liste des categories

  @Manufacturers
  Scenario: Je souhaite ajouter un nouveau manufacturers
    When Je clique sur le boutton  manufacturers
    And Je clique sur le boutton Add new du page manufacturers
    And Je saisie le nom du manufacturers
    And Je saisie la description du manufacturers
    And Je click sur le boutton save de la page  manufacturers
    Then un message "The new manufacturer has been added successfully." est affiche
