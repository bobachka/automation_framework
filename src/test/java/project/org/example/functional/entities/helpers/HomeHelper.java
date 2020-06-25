package project.org.example.functional.entities.helpers;

import project.org.example.functional.entities.pages.HomePage;

public class HomeHelper extends AbstractHelper {

    private HomePage homePage = new HomePage();

    public HomeHelper navigateToHomePage(){
        System.out.println("Go to home page");
        homePage.navigateToHomePage();
        return this;
    }

    public SearchHelper search (String searchKey){
        navigateToHomePage();
        homePage.fillSearchFld(searchKey).clickSearchBtn();
        return new SearchHelper();
    }
}
