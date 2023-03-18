Feature: Login feature
  User Story: As a user, I should be able to login
  HR user, Marketing user, Helpdesk user

  Background: User is expected to be on the login page for the scenarios on the feature file
    Given user is on the login page

  Scenario Outline: Login as HR user
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then HR user logged in successfully
    Examples:
      | username                 | password |
      | hr2@cybertekschool.com   | UserUser |
      | hr99@cybertekschool.com  | UserUser |
      | hr100@cybertekschool.com | UserUser |
      | hr5@cybertekschool.com   | UserUser |

  Scenario Outline: Login as Marketing user
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then Marketing user logged in successfully
    Examples:
      | username                        | password |
      | marketing1@cybertekschool.com   | UserUser |
      | marketing31@cybertekschool.com  | UserUser |
      | marketing22@cybertekschool.com  | UserUser |
      | marketing101@cybertekschool.com | UserUser |

  Scenario Outline: Login as Helpdesk user
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then Helpdesk user logged in successfully
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |


