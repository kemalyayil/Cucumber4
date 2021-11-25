package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KielHomePage;
import utilities.Driver;

public class US008 {

    KielHomePage page = new KielHomePage();

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici ilan ekle linkinin aktif oldugunu dogrular")
    public void kullaniciIlanEkleLinkininAktifOldugunuDogrular() {
        boolean durum = page.ilanEkleButon.isEnabled();
        Assert.assertTrue(durum);
    }

    @Then("kullanici ilan ekle linkinin arkaplan renginin {string} oldugunu dogrular")
    public void kullaniciIlanEkleLinkininArkaplanRengininOldugunuDogrular(String renkKodu) {
        String arkaplanRengi = page.ilanEkleButon.getCssValue("background-color");

        Assert.assertEquals(arkaplanRengi, renkKodu);
    }
}
/*
ID	Description	Expected	Actual	Pass/Fail
TC_001_US_008	İlan Ekle butonunun aktif olup olmadigini kontrol et	Aktif	Aktif	Pass
TC_002_US_008	İlan Ekle butonunun arkaplan rengi "#198754" olmalidir	#198754	#198754	Pass
TC_003_US_008	Giriş yapılmadığında linke tıkanırsa "/login" sayfasina gitmeli	"/login"	"/login"	Pass
TC_004_US_008	Giriş yapıldığında linke tıkanırsa "/add_ilan" sayfasina gitmeli	"/add_ilan"	"/add_ilan"	Pass

Bir kullanıcı olarak ana sayfaya girdiğimde, sayfanin sağ üst bölümünde "İlan Ekle" linkini görebilmeliyim.
http://environment.kielmarketplace.nl
Link aktif olmalıdır.Linkin arkaplan rengi "#198754" olmalıdır.
Giriş yapıldıysa linke tıklandığında "/add_ilan" sayfasina gidilmelidir.
Giriş yapılmadıysa linke tıklandığında "/login" sayfasina gidilmelidir.
 */