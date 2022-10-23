package com.syntax.Group16Project2Task4;

public interface Task4 {
    //4. Provide Implementation for the diagram below. Then
    //create a test class in which you need to create Objects of
    //ChromeDriver, FirefoxDrive and SafariDriver classes and
    //see which methods available to them
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriverInterface extends TakesScreenshotInterface, WebDriver {
    void navigate();
}
interface TakesScreenshotInterface{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriverInterface{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        String chrome = "Google.com";
        return chrome;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot Chrome Page");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        String firefox = "Mozilla homepage";
        return firefox;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot Mozilla FF");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FF");
    }
}
class SafariDriver implements RemoteWebDriverInterface {

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        String firefox = "Safari homepage";
        return firefox;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Screenshot Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }
}