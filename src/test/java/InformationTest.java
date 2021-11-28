import org.testng.Assert;
import org.testng.annotations.Test;

public class InformationTest extends BaseUI {
    @Test
    public void testInformation() {
        driver.findElement(Locators.LINK_HOW_WORKS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlHowWorks);
    }

}
