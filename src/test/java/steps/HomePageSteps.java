package steps;

import io.appium.java_client.android.AndroidElement;
import pages.HomeCarsPages;
import utilities.BeforeAndAfterTest;

import java.util.List;

public class HomePageSteps extends BeforeAndAfterTest {

    private List<AndroidElement> buttons;

    private static String osoboweBtnName = "OSOBOWE";
    private static String czesciBtnName = "CZĘŚCI";

    public HomePageSteps() {

    }

    private void findButtonsOnBar() {
        buttons = driver.findElements(HomeCarsPages.czesciTab);
    }
}
