package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KitapyurduPage {

    public KitapyurduPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Giriş Yap")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Çok Satan Kitaplar']")
    public WebElement cokSatanKitaplarDropDownMenu;

    @FindBy(xpath = "//a[@class='common-sprite allCategories']")
    public WebElement tumKategoriler;

    @FindBy(xpath = "//img[@alt='Çocuk Kitapları']")
    public WebElement cocukKitaplari;

    @FindBy(xpath = "//img[@alt='Kiraz Ağacı ile Aramızdaki Mesafe']")
    public WebElement kirazAgaciBook;

    @FindBy(xpath = "(//img[@alt='Nohut Adam'])[1]")
    public WebElement nohutAdam;

    @FindBy(xpath = "//a[@id='button-cart']")
    public WebElement sepeteEkleButonu;

    @FindBy(xpath = "//h4[@class='common-sprite']")
    public WebElement sepetimeGit;

    @FindBy(xpath = "js-checkout")
    public WebElement satinAlButonu;

    @FindBy(xpath = "//a[@class='button']")
    public WebElement alisveriseDevamEtButonu;

    @FindBy(xpath = "(//a[@class='mn-icon icon-hash'])[2]")
    public WebElement cocukKitaplari2;

    @FindBy(xpath = "//input[@id='search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='common-sprite button-search']")
    public WebElement searchButton;

    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[10]")
    public WebElement kirazAgaciSepeteEkle;

    @FindBy(xpath = "//input[@id='delivery-point']")
    public WebElement teslimNoktasindanAl;

    @FindBy(xpath = "//input[@id='ktp-230']")
    public WebElement tuzlaVestelTeslimNoktasi;

    @FindBy(xpath = "//button[@id='continue-button']")
    public WebElement devamEtButonu;

    @FindBy(xpath = "//input[@id='credit_card_number']")
    public WebElement kartNo;

    @FindBy(xpath = "//input[@id='credit_card_name']")
    public WebElement kartName;

    @FindBy(xpath = "//input[@id='credit_card_expires']")
    public WebElement kartSKT;

    @FindBy(xpath = "//input[@id='credit_card_security_code']")
    public WebElement kartCVC;

    @FindBy(xpath = "//input[@id='terms-and-conditions-agree']")
    public WebElement kullaniciSozlesmesiOnay;

    @FindBy(xpath = "//div[@class='heading']")
    public WebElement sepetimDropDownMenu;



    @FindBy(xpath = "//div[@class='jBox-closeButton jBox-noDrag']")
    public WebElement reklamiKapatButonu;


    @FindBy(id = "continue-button")
    public WebElement finishButton;

}
