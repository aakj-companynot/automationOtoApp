package steps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import pages.CarPartsPages;
import utilities.AndroidModel;

public class CarPartsSteps {

    public static void rollOutSearchForm() {
        AndroidModel.findElementBy(CarPartsPages.moreParameters).click();
    }

    public static void fillFormSearchWheelsPartsForMecedesBenz() {
        AndroidModel.findElementBy(CarPartsPages.usage).click();
//        AndroidModel.findElementBy(CarPartsPages.deliveryTrucks).click();
        AndroidModel.findElementBy(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + CarPartsPages.deliveryTrucksS + "\")")).click();
    }
}
