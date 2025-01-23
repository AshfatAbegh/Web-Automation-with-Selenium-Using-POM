package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        //Step 1: Get the current "Main" Window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");
        //Step 2: Get All Window Handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("No of Open Windows: " + allHandles.size());

        for (String handle : allHandles) {
            if(currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            }else{
                //driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }

        //Step 3: Switch to new Window using the Window Handle
    }
}
