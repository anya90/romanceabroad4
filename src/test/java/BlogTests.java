import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTests  extends BaseUI{
    @Test
    public void testBlog() {
        driver.findElement(Locators.LINK_BLOG).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia,Data.expectedUrlBlog);
    }
}
