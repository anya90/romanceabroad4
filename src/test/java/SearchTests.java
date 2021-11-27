import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests {
    @Test
    public void testSearchPage() {
        driver.findElement(LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlSearch);
    }
}
