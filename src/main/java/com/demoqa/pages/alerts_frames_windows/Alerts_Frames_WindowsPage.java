package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMEnuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");

    public FramesPage clickFrames(){
        scrollToElementJS(framesMEnuItem);
        click(framesMEnuItem);
        return new FramesPage();
    }

    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
