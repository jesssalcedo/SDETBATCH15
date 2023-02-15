package Class23;

public class WebDriverTester {

    public static void main(String[] args) {


        Chrome googleChrome = new Chrome(); //upCasting
        //Firefox firefox=new Friefox(;//down casting
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        // an Array of Type parent class can hold the objects of all child classes
        WebDriver[] browsers = {new Chrome(), new Safari(), new FireFox()};

        for (WebDriver browser : browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }

    }
}