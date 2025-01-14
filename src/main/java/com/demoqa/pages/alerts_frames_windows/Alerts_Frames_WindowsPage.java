package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']");

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
