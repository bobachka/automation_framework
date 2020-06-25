package project.org.example.functional.entities.pages;

public class HomePage extends AbstractPage {
    private static String logo = "//a[@class = 'header__logo']";
    private String searchFld = "//input[@class = 'text-field text-field_large search__input js-search-field']";
    private String searchBtn = "//div[@class = 'search__button-logo']";

    public static HomePage getHomePage() {
        HomePage homePage = new HomePage();
        waitForElementVisible(getElementBy(logo));
        System.out.println("Home page is opened");
        return homePage;
    }

    public HomePage navigateToHomePage() {
        openUrl(baseUrl);
        return getHomePage();
    }

    public HomePage fillSearchFld(String searchKey) {
        getElement(searchFld).sendKeys(searchKey);
        return getHomePage();
    }

    public SearchPage clickSearchBtn() {
        getElement(searchBtn).click();
        return SearchPage.getSearchPage();
    }
}
