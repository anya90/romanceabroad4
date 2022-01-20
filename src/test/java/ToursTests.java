import org.testng.Assert;
import org.testng.annotations.Test;

public class ToursTests extends BaseUI {
    @Test
    public void testTours() {
        driver.findElement(Locators.LINK_TOURS).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia,Data.expectedUrlTours);
    }
}
