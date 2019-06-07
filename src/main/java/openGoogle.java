import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class openGoogle {
    static WebDriver driver;

    static {
        try {
            driver = new RemoteWebDriver(new URL("http://10.186.71.104:4444/wd/hub"), new ChromeOptions());
//            driver = new RemoteWebDriver(new URL("http://10.186.65.37:4567/wd/hub"), new ChromeOptions());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public openGoogle() throws MalformedURLException {
    }


    public static void main(String[] args){
        driver.navigate().to("http://10.186.71.222/WebApp/WEBAPP/Home/Home/");
    }
}
