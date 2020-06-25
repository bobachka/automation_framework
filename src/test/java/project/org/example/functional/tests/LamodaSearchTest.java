package project.org.example.functional.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.org.example.functional.entities.helpers.HomeHelper;

public class LamodaSearchTest {
    private HomeHelper homeHelper = new HomeHelper();
    private String searchKey = "jeans";

    @Test
    public void performSearch() {
        int countPerPage = homeHelper.search(searchKey).getSearchResultsPerPage();
        Assert.assertTrue(countPerPage > 0, "Nothing is found");
    }

    @AfterClass
    public void tearDown() {
        homeHelper.quit();
    }
}
