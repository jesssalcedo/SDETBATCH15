package Class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser...");
    }

    public void openURL(){
        System.out.println("Opening a URL...");
    }

    public void testLoginPage(){
        System.out.println("Checking if login page works...");
    }

    public void closeBrowser (){
        System.out.println("Closing the browser...");
    }
}

class Chrome extends WebDriver{

    public void startBrowser(){
        System.out.println("Starting google chrome");
    }

    public void openURL(){
        System.out.println("Opening the URL in google chrome");
    }

    public void testLoginPage(){
        System.out.println("Testing the login page in Chrome");
    }

    public void closeBrowser(){
        System.out.println("Closing the google chrome");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("starting safari");
    }

    public void openUrl(){
        System.out.println("Opening the url in safari");
    }

    public void testLoginPage(){
        System.out.println("Testing login age in Safari");
    }

    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class FireFox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url in firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page in firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing broswer for firefox");
    }
}