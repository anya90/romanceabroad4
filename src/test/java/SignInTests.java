import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SignInTests extends BaseUI {
    By LINK_SIGN_IN = By.xpath("//a[@href='https://romanceabroad.com/users/login_form']");
    int indexLinkSignIn = 0;


    @Test
    public void testSignIn() {
        driver.findElements(LINK_SIGN_IN).get(indexLinkSignIn).click();
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
