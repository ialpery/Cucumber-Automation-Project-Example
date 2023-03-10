Feature: US1008 negatif login testi
  @so2
  Scenario Outline: TC15 farkli kullanicilarla negatif login testi

    Given kullanici "qdUrl" anasayfaya gider
    Then login linkine tiklar
    And username olarak "<username>" girer
    And password olarak "<password>" girer
    And login butonuna basar
    Then giris yapilamadigini test eder
    And Sayfayi kapatir

    Examples:
    |username           |password           |
    |qdGecerliUsername  |qdGecersizPassword |
    |qdGecersizUsername |qdGecerliPassword  |
    |qdGecersizUsername |qdGecersizPassword |