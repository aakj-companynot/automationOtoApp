package utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public abstract class BaseTest {

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        AndroidModel.startDriver();
    }

    @AfterTest
    public void afterTests() {
        AndroidModel.closeDriver();
    }
}
