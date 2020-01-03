package steps;

import io.appium.java_client.android.AndroidElement;
import utilities.BeforeAndAfterTest;

import java.util.List;

public class HomePageSteps extends BeforeAndAfterTest {


    public HomePageSteps() {

    }

    public List<AndroidElement> findButtonsOnBar() {
        List<AndroidElement> buttons = driver.findElements(pages.HomePage.czesciTab);
        return buttons;
    }
}
