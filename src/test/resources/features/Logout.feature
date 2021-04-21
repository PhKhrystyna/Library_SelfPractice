@BBRIT-21
Feature:  As a user, I should be able to logout from the library app.

  @BBRIT-17
  @logOut
  Scenario: As a Student, I should be able to logout from the library app.
    Given Student is logged and see the home page
    When the student clicks the dropdown button
    And the student clicks the logout button
    Then Student see the login page

  @BBRIT-18
  @logOut
  Scenario: As a Librarian, I should be able to logout from the library app.
    Given Librarian is logged and see the home page
    When  the librarian clicks the dropdown button
    And the librarian clicks the logout button
    Then Librarian see the login page