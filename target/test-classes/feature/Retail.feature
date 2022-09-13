@CompleteTest
Feature: Tek School Retail Website
  This feature will test the behavior of retail page

  Background: 
    Given user is on Retail home Page
    When user click on MyAccount

  @Test
  Scenario Outline: login to Retail website with multiple credentials
    And user click on Login option
    And user enter userName "<userName>"  and password "<password>"
    And user click on login button
    Then user should be logged into myAccount Page

    Examples: 
      | userName            | password  |
      | shark@tekschool.us  |    123456 |
      | tigers@tekschool.us | 987654321 |
      | titans@tekschool.us | 147852369 |

  @register
  Scenario: Register to Retail Website
    And user click on Register option
    And user fill the register form with below information
      | firstName | lastName | email                  | telephone  | password | passwordConfirm | subscribe |
      | James     | Bond     | jbond992@tekschool.us | 2021010007 | bond007  | bond007         | yes       |
    And user accept privacyPolicy
    And user click on Continue Button
    Then user should see a successfull message "Your Account Has Been Created!"
