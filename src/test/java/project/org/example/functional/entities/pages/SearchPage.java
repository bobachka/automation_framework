package project.org.example.functional.entities.pages;

public class SearchPage extends AbstractPage {
    private static String resultsCounter = "//span[@class = 'products-catalog__head-counter']";
    private static String results = "//div[@class = 'products-list-item dyother dyMonitor']";

    public static SearchPage getSearchPage() {
        SearchPage searchPage = new SearchPage();
        waitForElementVisible(getElementBy(results));
        System.out.println("Search page is opened");
        return searchPage;
    }

    public int getResultsPerPage() {
        return getElements(results).size();
    }

    public String getResultsTotal() {
        return getElement(resultsCounter).getText();
    }
}
