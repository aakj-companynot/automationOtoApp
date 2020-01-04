package steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import pages.SearchResultsPages;
import utilities.AndroidModel;

import java.util.List;

public class SearchResultsSteps {

    public static int checkResulst() {
        int res = 0;
        List<MobileElement> results = null;
        try {
            AndroidElement list = AndroidModel.findElementBy(SearchResultsPages.searchListResults);
            results = list.findElements(SearchResultsPages.result);
            res = results.size();
        } catch (Exception e) {
        }
        if (results == null) {
            AndroidModel.findElementBy(SearchResultsPages.emptyList);
            res = 0;
        }
        return res;
    }
}
