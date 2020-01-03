package pages;

import org.openqa.selenium.By;

public class CarPartsPages {

    public static final By moreParameters = By.id("show_more_filters");
    public static final By usage = By.id("subcategoryChooser");
    public static final By deliveryTrucks = By.xpath("*//android.widget.CheckedTextView[contains(text(),‘Części do pojazdów dostawczych’)]");
    public static final String deliveryTrucksS = "Części do pojazdów dostawczych";

}
