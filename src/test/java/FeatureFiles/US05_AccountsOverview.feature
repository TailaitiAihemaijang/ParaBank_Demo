Feature: Accounts Overview
  Background: Login
    Given Navigate To Para Bank
    And Enter Data in Text Box
      | logUserName | karahan  |
      | logUserPass | asdf0987 |
    And Click On The Element
      | logBtn |
    And Verification Is In Progress
      | succesly | Log Out |

    Scenario: Overview
      Given Click On The Element
      |accountOverview|
      And Verification Is In Progress
        | overviewSucc | Accounts Overview |
      And Click On The Element
      |accountNum|
      And Verification Is In Progress
        | accountDetailsSucc |Account Details  |