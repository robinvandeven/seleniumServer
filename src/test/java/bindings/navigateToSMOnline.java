package bindings;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;



public class navigateToSMOnline {
    static WebDriver driver;

    static void initializDriver(){
        try {
            driver = new RemoteWebDriver(new URL("http://10.186.71.104:4444/wd/hub"), new ChromeOptions());
//            driver = new RemoteWebDriver(new URL("http://10.186.65.37:4567/wd/hub"), new ChromeOptions());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Given("I open chrome and navigate to storeMate Online")
    public void i_open_chrome_and_navigate_to_storeMate_Online() {
        initializDriver();

        driver.navigate().to("http://10.186.71.222/WebApp/WEBAPP/Home/Home/");
    }

}
