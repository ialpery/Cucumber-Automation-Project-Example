Feature: US1001 Amazon Search

  Background:
    Given kullanici amazon anasayfaya gider

  Scenario: TC04 Kullanici amazonda nutella aratir

    When arama kutusuna Nutella yazip enter'a basar
    And Arama sonuclarinin Nutella icerdiğini test eder
    Then Sayfayi kapatir

  Scenario: TC05 Kullanici amazonda Samsung aratir

    When arama kutusuna Samsung yazip enter'a basar
    And Arama sonuclarinin Samsung icerdiğini test eder
    Then Sayfayi kapatir

  Scenario: TC06 Kullanici amazonda Apple aratir

    When arama kutusuna Apple yazip enter'a basar
    And Arama sonuclarinin Apple icerdiğini test eder
    Then Sayfayi kapatir