package Class25HomeWork;

//Create a WebDriver Interface that will have the
// following unimplemented behaviour: openBrowser(),
// closeBrowser(), maximizeWindow(), findElement().
// Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

interface  WebDriver {


    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Opened browser in ChromeDriver");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closed browser in Chrome driver");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("My Chrome has been maximized");

    }

    @Override
    public void findElement() {
        System.out.println("Element is found in Chrome");

    }
}
class FireFoxDriver implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Browser is open in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Browser is closed in Firefox");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window is maximized in Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Element is found in firefox");

    }
}