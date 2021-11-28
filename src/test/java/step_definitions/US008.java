//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.KielHomePage;
import pages.KielLoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US008 {
    KielHomePage page = new KielHomePage();
    KielLoginPage loginPage = new KielLoginPage();

    public US008() {
    }

    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String adres) {
        Driver.getDriver().get(adres);
    }

    @Then("kullanici ilan ekle linkinin aktif oldugunu dogrular")
    public void kullaniciIlanEkleLinkininAktifOldugunuDogrular() {
        boolean durum = this.page.ilanEkleButon.isEnabled();
        Assert.assertTrue(durum);
    }

    @Then("kullanici ilan ekle linkinin arkaplan renginin {string} oldugunu dogrular")
    public void kullaniciIlanEkleLinkininArkaplanRengininOldugunuDogrular(String renkKodu) {
        String arkaplanRengi = this.page.ilanEkleButon.getCssValue("background-color");
        Assert.assertEquals(arkaplanRengi, renkKodu);
    }

    @And("kullanici ilan ekle butonuna tiklar")
    public void kullaniciIlanEkleButonunaTiklar() {
        this.page.ilanEkleButon.click();
    }

    @Then("kullanici uzerinde bulundugu sayfanin urlinde {string} ifadesini dogrular")
    public void kullaniciUzerindeBulunduguSayfaninUrlindeIfadesiniDogrular(String path) {
        String url = Driver.getDriver().getCurrentUrl();
        System.out.println(url);
        boolean iceriyorMu = url.contains(path);
        Assert.assertTrue(iceriyorMu);
    }

    @And("kullanici sisteme {string} ve {string} bilgileri ile giris yapar")
    public void kullaniciSistemeVeBilgileriIleGirisYapar(String email, String sifre) {
        this.loginPage.emailKutusu.sendKeys(new CharSequence[]{email});
        this.loginPage.sifreKutusu.sendKeys(new CharSequence[]{sifre + Keys.ENTER});
        BrowserUtilities.waitFor(3);
    }

    @And("kullanici giris yap linkine tiklar")
    public void kullaniciGirisYapLinkineTiklar() {
        this.page.girisYapButon.click();
    }
}
