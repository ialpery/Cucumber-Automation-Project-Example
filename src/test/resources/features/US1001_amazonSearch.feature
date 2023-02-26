Feature: US1001 Amazon Search

  @amazon @smoke @regression
  Scenario: TC01 Kullanici amazonda nutella aratir

    Given kullanici amazon anasayfaya gider
    When arama kutusuna Nutella yazip enter'a basar
    And Arama sonuclarinin Nutella icerdiğini test eder
    Then Sayfayi kapatir

  @amazon @regression
  Scenario: TC02 Kullanici amazonda Samsung aratir

    Given kullanici amazon anasayfaya gider
    When arama kutusuna Samsung yazip enter'a basar
    And Arama sonuclarinin Samsung icerdiğini test eder
    Then Sayfayi kapatir
  @smoke @regression
  Scenario: TC03 Kullanici amazonda Apple aratir

    Given kullanici amazon anasayfaya gider
    When arama kutusuna Apple yazip enter'a basar
    And Arama sonuclarinin Apple icerdiğini test eder
    Then Sayfayi kapatir