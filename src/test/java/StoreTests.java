import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreTests extends BaseUI {

    @Test
    public void testStore() {
        driver.findElement(Locators.LINK_STORE).click();
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia,Data.expectedUrlStore);
    }
}
