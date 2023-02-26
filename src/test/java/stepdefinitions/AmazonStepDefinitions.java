package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama kutusuna Nutella yazip enter'a basar")
    public void arama_kutusuna_nutella_yazip_enter_a_basar() {
        amazonPage.aramaKutusuElementi.sendKeys(ConfigReader.getProperty("amazonArananUrun") + Keys.ENTER);
    }
    @When("Arama sonuclarinin Nutella icerdiğini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
       String expectedIcerik = "Nutella";
       String actualAramaSonucYazisi = amazonPage.aramaSonucYaziElementi.getText();
       Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @When("arama kutusuna Samsung yazip enter'a basar")
    public void arama_kutusuna_samsung_yazip_enter_a_basar() {
        amazonPage.aramaKutusuElementi.sendKeys("Samsung" + Keys.ENTER);

    }
    @When("Arama sonuclarinin Samsung icerdiğini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String expectedIcerik = "Samsung";
        String actualAramaSonucYazisi = amazonPage.aramaSonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }

    @When("arama kutusuna Apple yazip enter'a basar")
    public void aramaKutusunaAppleYazipEnterABasar() {
        amazonPage.aramaKutusuElementi.sendKeys("Apple" + Keys.ENTER);

    }

    @And("Arama sonuclarinin Apple icerdiğini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String expectedIcerik = "Apple";
        String actualAramaSonucYazisi = amazonPage.aramaSonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }

    @When("arama kutusuna {string} yazip enter'a basar")
    public void aramaKutusunaYazipEnterABasar(String aranacakKelime) {
        amazonPage.aramaKutusuElementi.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("Arama sonuclarinin {string} icerdiğini test eder")
    public void aramaSonuclarininIcerdiğiniTestEder(String arananKelime) {
        String actualAramaSonucYazisi = amazonPage.aramaSonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(arananKelime));
    }

    @And("{int} sn bekler")
    public void snBekler(int beklemeSuresiSaniye) {

        try {
            Thread.sleep(beklemeSuresiSaniye*1000);
        } catch (InterruptedException e) {

        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String url) {
       Driver.getDriver().get(ConfigReader.getProperty(url));

    }
    @Then("url'in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String expectedUrlIcerik) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

    }
}
