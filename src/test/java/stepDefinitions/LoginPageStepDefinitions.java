package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.KitapyurduPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class LoginPageStepDefinitions {

    KitapyurduPage kitapyurdu = new KitapyurduPage();

    @Given("go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));

    }
    @Then("enter the login button")
    public void enter_the_login_button() {
        ReusableMethods.wait(2);
        kitapyurdu.girisYapButton.click();
    }
    @Then("enter the valid e-mail in the e-mail text box")
    public void enter_the_valid_e_mail_in_the_e_mail_text_box() {
        ReusableMethods.wait(2);
        kitapyurdu.emailTextBox.sendKeys(ConfigReader.getProperty("e-posta"));
    }
    @Then("enter the valid password in the password box")
    public void enter_the_valid_password_in_the_password_box() {
        ReusableMethods.wait(2);
        kitapyurdu.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("click the login button")
    public void click_the_login_button() {
        ReusableMethods.wait(2);
        kitapyurdu.loginButton.click();
    }

    @When("accept cookies")
    public void acceptCookies() {
        ReusableMethods.wait(2);
        ReusableMethods.acceptCookies();
    }

    @And("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }


    @When("enter the bestseller menu")
    public void enter_the_bestseller_menu() {
        ReusableMethods.wait(2);
        kitapyurdu.cokSatanKitaplarDropDownMenu.click();
    }
    @When("click the kids books")
    public void click_the_kids_books() {
        ReusableMethods.wait(2);
        ReusableMethods.selectAnItemFromDropdown(kitapyurdu.cokSatanKitaplarDropDownMenu,"(//a[@class='mn-icon icon-angleRight'])[4]");
    }
    @When("select the Kiraz Agaci book")
    public void select_the_kiraz_agaci_book() {
        ReusableMethods.wait(2);
        ReusableMethods.elementinUzerineGel(kitapyurdu.kirazAgaciBook);
        kitapyurdu.kirazAgaciBook.click();

    }
    @When("add the basket")
    public void add_the_basket() {
        ReusableMethods.wait(2);
        kitapyurdu.sepeteEkleButonu.click();
    }


    @And("close the advert")
    public void closeTheAdvert() {
        ReusableMethods.wait(2);
        kitapyurdu.reklamiKapatButonu.click();
    }


    @When("enter the all categories")
    public void enter_the_all_categories() {
        ReusableMethods.wait(2);
        kitapyurdu.tumKategoriler.click();
    }
    @When("click the kids book")
    public void click_the_kids_book() {
        ReusableMethods.wait(2);
        kitapyurdu.cocukKitaplari.click();
    }
    @When("click nohut adam")
    public void click_nohut_adam() {
        ReusableMethods.wait(2);
        kitapyurdu.nohutAdam.click();
    }


    @Then("go to the sepetim")
    public void go_to_the_sepetim() {
        ReusableMethods.wait(2);
        kitapyurdu.sepetimeGit.click();

    }
    @Then("click the satin al butonu")
    public void click_the_satin_al_butonu() {
        ReusableMethods.wait(5);
        WebElement dropdown = driver.findElement(By.id("js-checkout"));
        dropdown.click();
    }

    @Then("click the alisveriseDevamEtButonu")
    public void click_the_alisverise_devam_et_butonu() {
        ReusableMethods.wait(5);
        kitapyurdu.alisveriseDevamEtButonu.click();
    }
    @Then("type kiraz agaci book in the search box")
    public void type_kiraz_agaci_book_in_the_search_box() {
        ReusableMethods.wait(2);
        kitapyurdu.searchBox.sendKeys("Kiraz Ağacı ile Aramızdaki Mesafe");
        kitapyurdu.searchButton.click();
    }
    @When("kiraz agaci kitabini sepete ekler")
    public void kiraz_agaci_kitabini_sepete_ekler() {
        ReusableMethods.wait(10);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", kitapyurdu.kirazAgaciSepeteEkle);
    }


    @When("click the teslim noktasindan al")
    public void click_the_teslim_noktasindan_al() {
        ReusableMethods.wait(2);
        kitapyurdu.teslimNoktasindanAl.click();
    }
    @When("select Tuzla point")
    public void select_tuzla_point() {
        ReusableMethods.wait(10);
        ReusableMethods.elementinUzerineGel(kitapyurdu.tuzlaVestelTeslimNoktasi);
        kitapyurdu.tuzlaVestelTeslimNoktasi.click();

    }
    @When("click the devam et butonu")
    public void click_the_devam_et_butonu() {
        ReusableMethods.wait(5);
        kitapyurdu.devamEtButonu.click();
    }
    @When("kart bilgilerini girer")
    public void kart_bilgilerini_girer() {
        ReusableMethods.wait(10);
        kitapyurdu.kartNo.sendKeys(ConfigReader.getProperty("kart_numarasi"));
        ReusableMethods.wait(2);
        kitapyurdu.kartName.sendKeys("Ahmet Burak Sarıgül");
        ReusableMethods.wait(2);
        kitapyurdu.kartSKT.sendKeys(ConfigReader.getProperty("son_kullanim_tarihi"));
        ReusableMethods.wait(2);
        kitapyurdu.kartCVC.sendKeys(ConfigReader.getProperty("cvv"));
    }
    @When("devam et butonuna tiklar")
    public void devam_et_butonuna_tiklar() {
        ReusableMethods.wait(2);
        kitapyurdu.devamEtButonu.click();
    }
    @When("sozlesme sartlarini kabul eder")
    public void sozlesme_sartlarini_kabul_eder() {
        ReusableMethods.wait(2);
        kitapyurdu.kullaniciSozlesmesiOnay.click();
    }


    @And("click the finish")
    public void clickTheFinish() {
        ReusableMethods.wait(2);
        kitapyurdu.finishButton.click();
        ReusableMethods.wait(2);
    }

    @And("kart bilgilerini yanlıs girer")
    public void kartBilgileriniYanlısGirer() {
        ReusableMethods.wait(10);
        kitapyurdu.kartNo.sendKeys(ConfigReader.getProperty("kart_numarasi"));
        ReusableMethods.wait(2);
        kitapyurdu.kartName.sendKeys("Ali Veli");
        ReusableMethods.wait(2);
        kitapyurdu.kartSKT.sendKeys("0999");
        ReusableMethods.wait(2);
        kitapyurdu.kartCVC.sendKeys("000");

    }
}
