package part3_4.com.demoqa.tests.part4.frames;

import com.demoqa.pages.alerts_frames_windows.FramesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected Text Don't Match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,
                "\n Actual & Expected Header Text Don't Match \n");
    }
}
