package steps;

import io.appium.java_client.android.AndroidElement;
import pages.HomeCarsPages;
import utilities.AndroidModel;

import java.util.List;

public class HomePageSteps {

    public static void goToPartsTabDriver() {
//        List<AndroidElement> tabs = AndroidModel.findElementsBy(HomeCarsPages.czesciTab);
//        tabs.get(1).click();

        AndroidModel.findElementByText(HomeCarsPages.czesciBtnName).click();
    }
}
