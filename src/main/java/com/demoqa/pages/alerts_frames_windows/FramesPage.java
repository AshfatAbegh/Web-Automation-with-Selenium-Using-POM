package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class FramesPage extends Alerts_Frames_WindowsPage {

    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }

    private void switchToBigBox(){
        driver.switchTo().frame(iFrameBigBox);
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println(bigFrameText);
        driver.switchTo().parentFrame();
        return bigFrameText;
    }
}
