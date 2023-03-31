Feature: Log out feature
  User Story: As a user, I should be able to log out
  Acceptance Criteria:
  1- The user can log out and ends up on the login page.
  2- The user can not go to the home page again by clicking the step back button after successfully logging out.
  3- The user must be logged out if the user close the open tab (all tabs if there are multiple open tabs)

  Background: User is expected to be on the login page for the scenarios on the feature file
    Given user is on the login page

  @AZUL10-455
  Scenario Outline: user can log out and ends up on the login page
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    And user clicks to the profile menu
    And user clicks to the log out
    Then user lands on the login page
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | marketing86@cybertekschool.com | UserUser |
      | marketing85@cybertekschool.com | UserUser |
      | hr100@cybertekschool.com       | UserUser |
      | hr5@cybertekschool.com         | UserUser |

  @AZUL10-456
  Scenario Outline: user can not go to the home page again by clicking the step back button after successfully logging out
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    And user clicks to the profile menu
    And user clicks to the log out
    And user lands on the login page
    And user clicks to the step back button
    Then user lands on the login page

    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | marketing86@cybertekschool.com | UserUser |
      | marketing85@cybertekschool.com | UserUser |
      | hr100@cybertekschool.com       | UserUser |
      | hr5@cybertekschool.com         | UserUser |

  @AZUL10-457
  Scenario Outline: user must be logged out if the user close the open tab (all tabs if there are multiple open tabs)
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    And user closes tab or tabs
    And user goes to main page
    Then user lands on the login page

    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | marketing86@cybertekschool.com | UserUser |
      | marketing85@cybertekschool.com | UserUser |
      | hr100@cybertekschool.com       | UserUser |
      | hr5@cybertekschool.com         | UserUser |