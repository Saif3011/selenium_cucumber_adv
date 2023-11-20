
@Customers
Feature: Verifier le boutton Customers
  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le boutton Log In
    Then Je me redirige vers la page home "Dashboard"
    When Je clique sur le boutton Customer
  @Customers1
  Scenario: Ajout d un nouveau Customer
    
    
    And Je selectionne l option Customer
    And Je clique sur le boutton Addnew
    And Je saisie l email "test321@gmail.com"
    And Je saisie le password "123456"
    And Je saisie le nom "saif"
    And Je saisie le prenom "dakhlaoui"
    And Je choisie le genre
    And Je choisis date de naissance
    And Je clique sur Save
    Then Un message "The new customer has been added successfully." est affiché en haut
    
@CustomersRole
 Scenario: Ajout d un nouveau CustomerRole
 When Je clique sur le boutton Customer roles
 And Je clique sur le boutton Addnew
 And Je saisie le nom "test" sur le champ name
 And Je coche le check box Free shipping 
 And Je coche le check box Override default tax display type
 And Je selectionne l option Excluding tax
 And Je clique sur le boutton choose a product
 And Je clique sur le boutton Save page costumer role
 Then Un message "The new customer role has been added successfully." est affiché en haut de la page customer role
 
 
 
 
 
 
 
 
 
 