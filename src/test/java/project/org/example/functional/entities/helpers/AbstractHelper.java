package project.org.example.functional.entities.helpers;

import project.org.example.functional.entities.pages.AbstractPage;

public class AbstractHelper {
    AbstractPage abstractPage = new AbstractPage();

    public void quit(){
        abstractPage.getDriver().quit();
    }

}
