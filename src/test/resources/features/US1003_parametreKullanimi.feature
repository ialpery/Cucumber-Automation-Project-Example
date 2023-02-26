Feature: US1003 Kullanici parametre ile arama yapabilir
  Background:
    Given kullanici amazon anasayfaya gider

   Scenario: TC07 Kullanici amazonda Nutella aratir

     When arama kutusuna "java" yazip enter'a basar
     And Arama sonuclarinin "java" icerdiğini test eder
     And 2 sn bekler
     Then Sayfayi kapatir

   Scenario: TC08 Kullanici amazonda Nutella aratir

     When arama kutusuna "Nutella" yazip enter'a basar
     And Arama sonuclarinin "Nutella" icerdiğini test eder
     Then Sayfayi kapatir