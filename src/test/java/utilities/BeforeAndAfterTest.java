package utilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BeforeAndAfterTest {

    private AndroidHandler androidHandler;
    public AndroidDriver<AndroidElement> driver;
    public FluentWait<MobileDriver> wait;

    @BeforeTest
    public void beforeTest() throws MalformedURLException {

        androidHandler = new AndroidHandler();
        driver = androidHandler.driver;
        wait = androidHandler.wait;
    }

    @AfterTest
    public void afterTets() {

    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
