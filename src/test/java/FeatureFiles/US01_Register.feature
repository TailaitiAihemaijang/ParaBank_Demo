Feature: Login Feature

  @SmokeTest
  Scenario: Login With Valid Data
    Given Navigate To Para Bank
    And Enter Data in Text Box
      | logUserName | karahan  |
      | logUserPass | asdf0987 |
    And Click On The Element
      | logBtn |
    And Verification Is In Progress
      | succesly | Log Out |
