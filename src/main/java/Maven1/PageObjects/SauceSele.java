package Maven1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SauceSele {


    // enter your saucelabs user name here
    final String USERNAME = "Earthtetingsauce@gmail.com";
    final String ACCESS_KEY = "da8ce962-14f2-42ca-8246-186c7562bfdf";
    //          final String url = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
    final String SauceLabURL = "https://Earthtestingsauce@gmail.com:da8ce962-14f2-42ca-8246-186c7562bfdf@ondemand.saucelabs.com:443/wd/hub";

    private WebDriver driver;

    @Test(priority = 1)
    public void test_Windows_Firefox() throws Exception {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "67.0");
        driver = new RemoteWebDriver(new URL(SauceLabURL), caps);
        driver.get("https://seleniumbycharan.wordpress.com/");
        System.out.println(driver.getTitle());
        System.out.println("BrowserName" + caps.getBrowserName() + " -"
        + "Version :" + caps.getVersion());
        System.out
                .println("_______________________________________________");
    }
}
