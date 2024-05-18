package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.internal.RealSystem;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BimserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class BimserStepdefinitions {

    BimserPage bimserPage;

    @Given("Kullanici {string} adresi ile anasayfaya gider")
    public void kullanici_bimser_url_adresi_ile_anasayfaya_gider(String BimserUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(BimserUrl));
    }
    @Given("Bimser alanina tiklanir.")
    public void bimser_alanina_tiklanir() {
        bimserPage = new BimserPage();
        bimserPage.bimser.click();
    }
    @Given("Bimsere tiklandigi dogrulanir.")
    public void bimsere_tiklandigi_dogrulanir() {
        Assert.assertTrue(bimserPage.bimser.isDisplayed());
    }
    @Given("Documentation alanina tiklanir")
    public void documentation_alanina_tiklanir() {
        bimserPage.documentation.click();

    }
    @Given("Bimser Blog alanina tiklanir.")
    public void bimser_blog_alanina_tiklanir() {
        ReusableMethods.bekle(5);
        bimserPage.bimserBlog.click();

        String ilkSayfaWhd= Driver.getDriver().getWindowHandle();
        /*
        ilkSayfaWhd adlı bir değişkene, şu anki pencerenin kimliği atanır.
        Bu, Driver.getDriver().getWindowHandle() yöntemiyle elde edilir. Bu kimlik, mevcut açık pencerenin benzersiz bir tanımlayıcısıdır.
         */

        String ikinciSayfaWhd="";
        //ikinciSayfaWhd adlı boş bir dize oluşturulur. Bu değişken, ikinci pencerenin kimliğini tutmak için kullanılır.

        Set<String> whdSeti=Driver.getDriver().getWindowHandles();
        //getWindowHandles() yöntemi, tüm açık pencerelerin kimliklerini içeren bir küme döndürür. Bu küme, whdSeti adlı bir değişkende saklanır.

        for (String each: whdSeti
                //for döngüsü, whdSeti kümesindeki her bir pencere kimliğini kontrol eder.
        ) {
            if (!each.equals(ilkSayfaWhd)){
                ikinciSayfaWhd=each;
                /*
                Döngünün her adımında, o andaki pencere kimliği each değişkenine atanır.
                Eğer bu kimlik, ilk sayfanın kimliği değilse (yani, each ve ilkSayfaWhd aynı değilse), bu kimlik ikinciSayfaWhd değişkenine atanır.
                 */
            }
        }
        //Driver.switchTo().window(ikinciSayfaWhd);
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ikinciSayfaWhd);
        /*
        Son olarak, Driver.getDriver().switchTo().window(ikinciSayfaWhd) koduyla WebDriver, ikinci sayfaya geçer.
         Bu, switchTo().window() yöntemiyle, WebDriver'ın kontrolünü belirtilen pencereye değiştirir.
         */
        ReusableMethods.bekle(5);

        Driver.getDriver().switchTo().window(ilkSayfaWhd);

    }
    @Given("Dil degisim alanina tiklanir.")
    public void dil_degisim_alanina_tiklanir() {
        ReusableMethods.bekle(5);
        bimserPage.dilSecimi.click();
        ReusableMethods.bekle(5);
    }
    @Given("Dil olarak English secilir.")
    public void dil_olarak_english_secilir() {

    }
    @Given("Dil alaninin hemen yaninde yer alan Bimser alanina tiklanir.")
    public void dil_alaninin_hemen_yaninde_yer_alan_bimser_alanina_tiklanir() {
    }
    @Then("karanlik ve aydınlik mod arasinda gecis yapilir.")
    public void karanlik_ve_aydınlik_mod_arasinda_gecis_yapilir() {
    }
    @Then("sayfayi kapatir.")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }
}
