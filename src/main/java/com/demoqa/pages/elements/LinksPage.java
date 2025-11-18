package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptyUtility.scrollToElementJS;

public class LinksPage extends ElementsPage {

    private By badRequestLink = By.id("bad-request");
    private By responseLink = By.id("linkResponse");

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        click(badRequestLink);
    }

    public String getReponse() {
        delay(2000);
        return find(responseLink).getText();
    }


}
