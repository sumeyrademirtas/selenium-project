package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

@Test // every method in this class will be identified as test method
public class AlertsTest extends BaseTest {

    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage =
                homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert(); // Accept etmeden sayfada baska bir islem yapamayiz.

    }

    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult, "\n You Did Not Select Cancel \n");

    }

    public void testPromptAlert() {
        String alertText = "Selenium with Java";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        String expectedResult = "You entered " + alertText;
        Assert.assertEquals(actualResult, expectedResult, "\n Actual & Expected Results Do Not Match \n");
    }

}
