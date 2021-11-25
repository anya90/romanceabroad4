import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    String expectedUrlSearch = "https://romanceabroad.com/users/search";
    String expectedUrlMedia = "https://romanceabroad.com/media/index";
    String expectedUrlStore = "https://romanceabroad.com/store/category-sweets";
    String expectedUrlTours = "https://romanceabroad.com/store/sweets/20-tour_to_ukraine";
    String expectedUrlHowWorks = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlBlog = "https://romanceabroad.com/content/view/blog";
    By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    By LINK_HOW_WORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_TOURS = By.xpath("//a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    By LINK_STORE = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");
    By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    By BUTTON_NEXT= By.xpath("//button[@data-action='next-page'][text()='Next']");
    int indexLinkSignIn = 0;
    String email = "123@gmail.com";
    String password = "12@gmail.com";


    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }

    @Test
    public void testInformation() {
        driver.findElement(LINK_HOW_WORKS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlHowWorks);
    }



    @Test
    public void testMainPage() {
        driver.findElement(LINK_MEDIA).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlMedia);
    }

    @Test
    public void testStore() {
        driver.findElement(LINK_STORE).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlStore);
    }

    @Test
    public void testTours() {
        driver.findElement(LINK_TOURS).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlTours);
    }
    @Test
    public void testBlog() {
        driver.findElement(LINK_BLOG).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, expectedUrlBlog);
    }

    @Test
    public void testSignIn() {
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
    }

    @Test
    public void testRegistration() {
        driver.findElement(BUTTON_REGISTRATION).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys(email);
        driver.findElement(By.cssSelector("input#password")).sendKeys(password);
        driver.findElement(BUTTON_NEXT).click();


    }

    @AfterMethod
    public void afterActions() {
        //  driver.quit();
    }
}
//Xpath
//a[@class='nav-link active'][@href='https://romanceabroad.com/users/login_form']
//a[@href='https://romanceabroad.com/content/view/blog']
//a[@href='https://romanceabroad.com/media/index']
//select[@name='age_min']
//select[@name='age_max']
//a[@href='https://romanceabroad.com/store/category-sweets']
//a[@href='https://romanceabroad.com/media/photo']
//a[contains(text(),'Forgot password?')]
//div[2]/div/input
//a[@href='https://romanceabroad.com/start/index']


//Css selector
//select[name='age_min']
//a[href='https://romanceabroad.com/media/index']
//ul>li>[href='https://romanceabroad.com/users/search']
//ul>li>[href='https://romanceabroad.com/store/category-sweets']
//ul>li>[href='https://romanceabroad.com/content/view/blog']
//ul>li>[href='https://romanceabroad.com/users/login_form']
//ul>li>[href='https://romanceabroad.com/content/view/how-it-works']
//ul>li>[href='https://romanceabroad.com/content/view/privacy-and-security']
//input[id='search_product']
//#navbarResponsive > ul > li:nth-child(6) > a
