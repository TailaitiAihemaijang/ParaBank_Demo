Feature: Bill Pyamnet
  Background: Login
    Given Navigate To Para Bank
    And Enter Data in Text Box
      | logUserName | karahan  |
      | logUserPass | asdf0987 |
    And Click On The Element
      | logBtn |
    And Verification Is In Progress
      | succesly | Log Out |

    Scenario: Bill Payment
      Given Click On The Element
        | billPay |
      Then Enter Data in Text Box
        | payName       | EnerjiSa Elektirk Faturası |
        | payAdders     | istanbul                   |
        | payCity       | istanbul                   |
        | payState      | Tester                     |
        | payCode       | 34100                      |
        | payPhoneNum   | 531000000                  |
        | payAccountNum | 16008                      |
        | verifyAccount | 16008                      |
        | amount        | 12                         |
      And Click On The Element
        | btnSendPayment |
      And Verification Is In Progress
        | paymentSuccesly | Bill Payment Complete |
