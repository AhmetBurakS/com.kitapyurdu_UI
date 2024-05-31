Feature: Login test (Pozitif)

  @smoke
  Scenario: [US_01 / TC_01] Kayıtlı bir kullanıcı olarak, websitesine erişebilmek için login olabilmeliyim.

    Given  go to "URL"
    When   accept cookies
    And    enter the login button
    And    enter the valid e-mail in the e-mail text box
    And    enter the valid password in the password box
    And    click the login button
    And    close driver

