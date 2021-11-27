package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private static final String PAGE_URL = "http://automationpractice.com/index.php";

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchButton;

    @FindBy (id = "search_query_top")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    private WebElement contactUsButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signInButton;

    @FindBy(id = "wishlist_button")
    private WebElement wishlistButton;

    @FindBy(id = "newsletter_input")
    private WebElement newsletterField;

    @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
    private WebElement newsletterButton;

    @FindBy(xpath = "//*[@id=\"columns\"]/p")
    private WebElement newsletterErrorMessage;

    @FindBy (xpath = "//*[@id=\"columns\"]/p")
    private WebElement newsletterSuccessMessage;

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/div/p")
    private WebElement wishlistErrorMessage;

    @FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/div/p")
    private WebElement wishlistSuccessMessage;

    public Homepage(WebDriver driver){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void searchField(String text){ searchField.sendKeys(text);}

    public void searchButton(){
        searchButton.click();
    }

    public void contactUsButton(){contactUsButton.click();}

    public void signInButton(){signInButton.click();}

    public void wishlistButton(){wishlistButton.click();}

    public void newsletterButton(){newsletterButton.click();}

    public String getNewsletterErrorMessageText(){return newsletterErrorMessage.getText();}

    public String getNewsletterSuccessMessageText(){return newsletterSuccessMessage.getText();}

    public String getWishlistErrorMessageText(){return wishlistErrorMessage.getText();}

    public String getWishlistSuccessMessageText(){return wishlistSuccessMessage.getText();}

    public void newsletterField(String text){newsletterField.sendKeys(text);}







}
