package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Nuriye Sumeyra Demirtas");
        textBoxPage.setEmail("smyrdmrts@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Aveneu");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Dallas, Texas"), "\n Actual Address Does Not Contain Dallas, Texas \n");

    }
}
