import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String currentUrlMedia;
    By LINK_HOW_WORKS = By.xpath("//a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    int indexLinkSignIn = 0;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }
    @AfterMethod
    public void afterActions() {
        //  driver.quit();
    }
}
