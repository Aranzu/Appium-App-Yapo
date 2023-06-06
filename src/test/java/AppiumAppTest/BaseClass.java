package AppiumAppTest;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Redme Note 8 Pro");
        cap.setCapability("udid","p789irz5dyemw4y9");
        cap.setCapability("platformName","Android");
        cap.setCapability("plataformVersion","11 RP1A.200720.011");
        cap.setCapability("appPackage","cl.yapo");
        cap.setCapability("appActivity","cl.yapo.milkyway.launch.LaunchActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}