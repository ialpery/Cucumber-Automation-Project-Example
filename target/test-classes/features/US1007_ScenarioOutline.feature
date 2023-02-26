Feature: US1007 Scenario Outline ile coklu test

  @so
  Scenario Outline: TC14 Amazon coklu arama testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "<arananKelime>" yazip enter'a basar
    Then Arama sonuclarinin "<kontrolKelime>" icerdiğini test eder
    And Sayfayi kapatir

    Examples:
    |arananKelime|kontrolKelime|
    |Nutella     |Nutella      |
    |Samsung     |Samsung      |
    |Apple       |Apple        |
    |Java        |C#           |
