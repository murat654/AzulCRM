Feature: Login feature
  User Story: As a user, I should be able to login
  HR user, Marketing user, Helpdesk user

  Background: User is expected to be on the login page for the scenarios on the feature file
    Given user is on the login page

  @AZUL10-445
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

  @AZUL10-446
  Scenario Outline: Login as Marketing user
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then Marketing user logged in successfully
    Examples:
      | username                       | password |
      | marketing90@cybertekschool.com | UserUser |
      | marketing92@cybertekschool.com | UserUser |
      | marketing95@cybertekschool.com | UserUser |
      | marketing99@cybertekschool.com | UserUser |

  @AZUL10-447
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

  @AZUL10-448
  Scenario Outline: "Incorrect login or password." display verification for invalid credentials
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then user sees Incorrect login or password message
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | dasdadad |
      | helpdesk99@cybertekschool.com  | 0799767j |
      | dsfsdfsfsdf@cybertekschool.com | UserUser |
      | helpdesk5@sdfsdffsdvsdvc.com   | UserUser |

  @AZUL10-449
  Scenario Outline: "Please fill out this field" display verification when the password or username is empty
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then user sees Please fill out this field message
    Examples:
      | username                     | password |
      | helpdesk2@cybertekschool.com |          |
      |                              | UserUser |
      |                              | UserUser |
      | helpdesk5@cybertekschool.com |          |

  @AZUL10-450
  Scenario: user lands on the ‘Get Password’ page after clicking on the "Forgot your password?" link
    Given user clicks Forgot your password? link
    Then user lands on the Get Password page

  @AZUL10-451
  Scenario: user sees "Remember Me" link exists and is clickable on the login page
    Then user sees Remember Me link and is clickable

  @AZUL10-452
  Scenario Outline: user sees the password in bullet signs by default
    Given user enters username "<username>"
    And user enters password "<password>"
    Then user sees the password in bullet signs by default
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | dasdadad |
      | helpdesk99@cybertekschool.com  | 0799767j |
      | dsfsdfsfsdf@cybertekschool.com | UserUser |
      | helpdesk5@sdfsdffsdvsdvc.com   | UserUser |

  @AZUL10-453
  Scenario Outline: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page
    Given user enters username "<username>"
    And user enters password "<password>" clicks to the Enter key
    Then Helpdesk user logged in successfully
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | helpdesk100@cybertekschool.com | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |

  @AZUL10-454
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login
    Given user enters username "<username>"
    And user enters password "<password>"
    And user clicks to the login button
    Then user sees "<username>" the username in the profile menu
    Examples:
      | username                       | password |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk99@cybertekschool.com  | UserUser |
      | marketing86@cybertekschool.com | UserUser |
      | marketing85@cybertekschool.com | UserUser |
      | hr100@cybertekschool.com       | UserUser |
      | hr5@cybertekschool.com         | UserUser |