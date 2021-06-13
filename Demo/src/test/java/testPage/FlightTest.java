package testPage;

import org.testng.annotations.Test;
import pages.Flight;
import pages.TransportPage;
import utils.TestBase;

public class FlightTest extends TestBase {

    @Test(groups = {"smoke"}, priority = 1)

    public void flightDemoTest() throws InterruptedException {

        Flight.clickradioMulticity();

        Flight.isDisplaybuttonFlights();
        Flight.clickradioMulticity();
        Flight.entertxtFromCityOne("Dubai");
        Flight.entertxtToCityOne("New York (Any)");
        Flight.gettxtFromCityTwo("New York (Any)");
        Flight.entertxtToCityTwo("Los Angeles (Any)");
        Flight.clickbuttonAddAnotherFlight();
        Flight.entertxtThirdDestinationcity("Los Angeles (Any)");
        Flight.txtThirdDepartureCity("Dubai");
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
        Thread.sleep(400);
        TransportPage.clickOnDirectCheckbox();
        TransportPage.clickOncheckBoxTwoStop();
        TransportPage.scrollDuabiToNewyork();
        TransportPage.scollToNewToLos();
        TransportPage.scollFromLosTodubai();
        TransportPage.setTotalDurationS();
        TransportPage.clickComboSortBy();
        TransportPage.clickComboSortBy();
        TransportPage.clickSelectButton();



//        driver.close();
    }




}
