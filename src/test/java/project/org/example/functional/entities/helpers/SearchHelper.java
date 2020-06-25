package project.org.example.functional.entities.helpers;

import project.org.example.functional.entities.pages.SearchPage;

public class SearchHelper extends AbstractHelper {
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsPerPage() {
        return searchPage.getResultsPerPage();
    }

    public int getSearchResultsTotal() {
        return Integer.parseInt(searchPage.getResultsTotal().split(" ")[0]);
    }
}
