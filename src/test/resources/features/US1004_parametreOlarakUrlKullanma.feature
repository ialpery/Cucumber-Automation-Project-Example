Feature: US1004 Url'i parametre olarak kullanma

  Scenario: TC09 kullanici url icin parametre kullanabilmeli

    Given kullanici "youtubeUrl" anasayfaya gider
    Then url'in "amazon" icerdigini test eder
    And Sayfayi kapatir