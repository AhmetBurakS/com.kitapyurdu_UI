Feature: Kitap satin alma testi (Pozitif)


  Background:

    Given  go to "URL"
    And    accept cookies
    Then   enter the login button
    And    enter the valid e-mail in the e-mail text box
    And    enter the valid password in the password box
    And    click the login button


  @e2e
  Scenario: [US_02 / TC_01] Kayıtlı bir kullanıcı olarak, kitap siparişini başarıyla verebilmeliyim.

    When   enter the all categories
    And    click the kids book
    And    click nohut adam
    And    add the basket
    Then   go to the sepetim
    And    click the satin al butonu
    And    click the alisveriseDevamEtButonu
    And    type kiraz agaci book in the search box
    When   kiraz agaci kitabini sepete ekler
    And    go to the sepetim
    And    click the satin al butonu
    And    click the teslim noktasindan al
    And    select Tuzla point
    And    click the devam et butonu
    And    kart bilgilerini girer
    And    devam et butonuna tiklar
    And    sozlesme sartlarini kabul eder
    And    click the finish
    And    close driver



