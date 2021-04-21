@G17-152
Feature: As a user, I should be able to  see several modules once I login

 @G17-153
 Scenario: Student should have access to 2 modules
   Given the student on the home page
   Then the student should see following modules
     | Books           |
     | Borrowing Books |


 @G17-154
 Scenario: Librarians  should have access to 3 modules
   Given the librarian on the homepage
   Then the user should see following modules
     | Dashboard |
     | Users     |
     | Books     |