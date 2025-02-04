package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("John Doe");
        textBoxPage.setEmail("john.doe@gmail.com");
        textBoxPage.setCurrentAddress("Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 2200");
        textBoxPage.setCurrentAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 2200"),
                "\n Actual address doesn't contain Suite 2200 \n");
    }
}
