package testPage;

import org.testng.annotations.Test;
import pages.Flight;
import pages.TransportPage;
import testData.FlightDataExcel;
import utils.TestBase;

public class DataProviderFlightTest extends TestBase {
    @Test(groups = {"test"}, priority = 1, dataProviderClass = FlightDataExcel.class, dataProvider = "Flightcity")

    public void useExceldataDrivenTest(String destination_City_1, String departure_City_1, String destination_City_2, String departure_City_2, String destination_City_3, String departure_City_3) throws InterruptedException {

        Flight.clickradioMulticity();

        Flight.isDisplaybuttonFlights();
        Flight.clickradioMulticity();
        Flight.entertxtFromCityOne(destination_City_1);
        Flight.entertxtToCityOne(departure_City_1);
        Flight.gettxtFromCityTwo(destination_City_2);
        Flight.entertxtToCityTwo(departure_City_2);
        Flight.clickbuttonAddAnotherFlight();
        Flight.entertxtThirdDestinationcity(destination_City_3);
        Flight.txtThirdDepartureCity(departure_City_3);
        Flight.validateDesigationandDeparture();
        Flight.clickDatePickerCalender();
        Flight.selectdatePickerDate();
        Flight.clickbuttonThirdCalender();
        Flight.clickselectThirdDpartureDate();
        Flight.clickbuttonPassenger();
        Flight.clickplusAdult();
        Flight.clickplusChildren();
        Flight.clickplusChildren();
        Flight.clickcomboChildOneAge();
        Flight.clickcomboChildTwoAge();
        Flight.clicklinkDone();
        Flight.searchFlight();
        Flight.implicitWait(3);
        TransportPage.clickOnDirectCheckbox();
        Flight.implicitWait(3);
        TransportPage.clickOncheckBoxTwoStop();
        Flight.implicitWait(3);
        TransportPage.scrollDuabiToNewyork();
        Flight.implicitWait(3);
        TransportPage.scollToNewToLos();
        TransportPage.scollFromLosTodubai();
        Flight.implicitWait(3);
        TransportPage.setTotalDurationS();
        TransportPage.clickComboSortBy();
        TransportPage.clickComboSortBy();
        TransportPage.clickSelectButton();

    }

}
