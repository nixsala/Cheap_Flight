package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.asserts.SoftAssert;
import utils.PageBase;


public class Flight extends PageBase {
    /*
    Web Element Declaration
     */


    private static By radioMulticity = By.cssSelector("input[id=fsc-trip-type-selector-multi-destination");
    private static By txtFromCityOne = By.cssSelector("input[id='fsc-origin-search-0']");
    private static By buttonFlights = By.cssSelector("a[id='airli']");
    private static By txtToCityOne = By.cssSelector("input[id='fsc-destination-search-0']");
    private static By txtFromCityTwo = By.id("fsc-origin-search-1");
    private static By txtToCityTwo = By.id("fsc-destination-search-1");
    private static By datePicker = By.cssSelector("button[id='fsc-leg-date-0-fsc-datepicker-button']");
    private static By buttonAddAnotherFlight = By.cssSelector("button[class='BpkButtonBase_bpk-button__3QGRV BpkButtonSecondary_bpk-button--secondary__1quDO']");
    private static By txtFromCityThree = By.cssSelector("input[id='fsc-origin-search-2']");


    private static By clickDatePicker = By.id("fsc-leg-date-1-fsc-datepicker-button");

    private static By datePickerSelectDate = By.xpath("//*[@id=\"fsc-leg-date-1-fsc-datepicker-popover\"]/div/div/div/div/table/tbody/tr[4]/td[3]/button");


    private static By buttonPassenger = By.id("CabinClassTravellersSelector_fsc-class-travellers-trigger__LeM38");
    private static By plusAdult = By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[1]/div/button[2]");
    private static By plusChildren = By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/div/div/div[2]/div/button[2]");
    private static By comboChildOneAge = By.xpath("//*[@id=\"children-age-dropdown-0\"]");
    private static By comboChildTwoAge = By.xpath("//*[@id=\"children-age-dropdown-1\"]");
    private static By linkDone = By.xpath("//*[@id=\"cabin-class-travellers-popover\"]/footer/button");
    private static By buttonSearchFlight = By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button");
    private static By txtThirdDepartureCity = By.cssSelector("input[id='fsc-destination-search-2']");
    private static By buttonThirdCalender = By.xpath("//*[@id=\"fsc-leg-date-2-fsc-datepicker-button\"]");
    private static By selectThirdDpartureDate = By.xpath("//*[@id=\"fsc-leg-date-2-fsc-datepicker-popover\"]/div/div/div/div/table/tbody/tr[5]/td[3]/button");
    private static By txtThirdDestinationcity = By.xpath("//*[@id=\"fsc-origin-search-2\"]");


    private static By validatePassenger = By.xpath("//*[@id=\"app-root\"]/div/div[2]/div/div[1]/div/div[1]");





   /*
    Verify whether in Flight Tab
     */

    public static void isDisplaybuttonFlights() {
        getDriver().findElement(buttonFlights).isDisplayed();
        System.out.println("The CURRENT page is in " + getDriver().findElement(buttonFlights).getText());

    }

    /*
    Click Radio Button
     */

    public static void clickradioMulticity() {
        WebElement radioSelect = getDriver().findElement(radioMulticity);
        boolean isSelected = radioSelect.isSelected();
        if (isSelected == false) {
            radioSelect.click();

        }

    }

    /*
    Enter the start destination
     */
    public static void entertxtFromCityOne(String destiantionStartCity) {
        getDriver().findElement(txtFromCityOne).click();
        getDriver().findElement(txtFromCityOne).sendKeys(Keys.CONTROL, Keys.chord("a"));
        getDriver().findElement(txtFromCityOne).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(txtFromCityOne).sendKeys(destiantionStartCity);
        getDriver().findElement(txtFromCityOne).sendKeys(Keys.ENTER);


    }

    /*
   Enter the Departure
    */
    public static void entertxtToCityOne(String cityOneTo) {
        getDriver().findElement(txtToCityOne).sendKeys(Keys.CONTROL, "a");
        getDriver().findElement(txtToCityOne).sendKeys(Keys.DELETE);
        getDriver().findElement(txtToCityOne).sendKeys(cityOneTo);
        getDriver().findElement(txtToCityOne).sendKeys(Keys.ENTER);


    }

    /*
    Click Calender
     */
    public static void clickDate() {
        ((JavascriptExecutor) getDriver()).executeScript("document.getElementBy.cssSelector('button[id='fsc-leg-date-0-fsc-datepicker-button']').setAttribute('value','2021-09')");
        WebElement date = getDriver().findElement(By.cssSelector("button[id='fsc-leg-date-0-fsc-datepicker-button']"));
        date.clear();
        date.sendKeys("September 2021");


    }


    /*
    Enter the second Destination
     */

    public static void gettxtFromCityTwo(String citytwodestination) {
        getDriver().findElement(txtFromCityTwo).click();
        getDriver().findElement(txtFromCityTwo).sendKeys(citytwodestination);
        getDriver().findElement(txtFromCityTwo).sendKeys(Keys.ENTER);


    }


    /*
   Enter the second departure
    */
    public static void entertxtToCityTwo(String twoDeparture) {
        getDriver().findElement(txtToCityTwo).sendKeys(Keys.CONTROL, "a");
        getDriver().findElement(txtToCityTwo).sendKeys(Keys.DELETE);
        getDriver().findElement(txtToCityTwo).sendKeys(twoDeparture);
        getDriver().findElement(txtToCityTwo).sendKeys(Keys.ENTER);

    }


    /*
   Click AddAnotherFlight
    */
    public static void clickbuttonAddAnotherFlight() {
        getDriver().findElement(buttonAddAnotherFlight).click();
//        Assert.assertEquals(getDriver.findElement(txtToCityTwo);
//        getDriver.findElement(txtFromCityThree));

/*
click button Passenger
 */
    }

    public static void clickbuttonPassenger() {
        getDriver().findElement(buttonPassenger).click();


    }

    /*
    click plus Adult icon
     */
    public static void clickplusAdult() {
        getDriver().findElement(plusAdult).click();


    }


    /*
    click plus Children icon
     */
    public static void clickplusChildren() {
        getDriver().findElement(plusChildren).click();


    }
/*
click combo Child One Age
 */

    public static void clickcomboChildOneAge() {
        getDriver().findElement(comboChildOneAge).click();
        Select selectChildOneAge = new Select(getDriver().findElement(comboChildOneAge));
        selectChildOneAge.selectByIndex(3);


    }

    /*
    click combo Child Two Age
     */
    public static void clickcomboChildTwoAge() {
        getDriver().findElement(comboChildTwoAge).click();
        Select selectChildOneAge = new Select(getDriver().findElement(comboChildTwoAge));
        selectChildOneAge.selectByIndex(5);


    }

    /*
    click on link Done
     */
    public static void clicklinkDone() {
        getDriver().findElement(linkDone).click();


    }


    /*
   click on Calender
    */
    public static void clickDatePickerCalender() {
        getDriver().findElement(clickDatePicker).click();

    }

    /*
Select the date

    */
    public static void selectdatePickerDate() {
        getDriver().findElement(datePickerSelectDate).click();


    }


    /*
    Click Search Flight
     */
    public static void searchFlight() {
        getDriver().findElement(buttonSearchFlight).click();


    }

    /*
    Enter the third departure city
     */
    public static void txtThirdDepartureCity(String thirdDeparture) {
        getDriver().findElement(txtThirdDepartureCity).click();
        getDriver().findElement(txtThirdDepartureCity).sendKeys(Keys.CONTROL, "a");
        getDriver().findElement(txtThirdDepartureCity).sendKeys(Keys.DELETE);
        getDriver().findElement(txtThirdDepartureCity).sendKeys(thirdDeparture);
        getDriver().findElement(txtThirdDepartureCity).sendKeys(Keys.ENTER);


    }

    /*
Click third departure Calender    */
    public static void clickbuttonThirdCalender() {
        getDriver().findElement(buttonThirdCalender).click();


    }

    /*
Select date  from third departure Calender    */

    public static void clickselectThirdDpartureDate() {
        getDriver().findElement(selectThirdDpartureDate).click();


    }


    /*
   Enter the third destination city
    */
    public static void entertxtThirdDestinationcity(String thirdDestination) {
        getDriver().findElement(txtThirdDestinationcity).click();
        getDriver().findElement(txtThirdDestinationcity).sendKeys(Keys.CONTROL, "a");
        getDriver().findElement(txtThirdDestinationcity).sendKeys(Keys.DELETE);
        getDriver().findElement(txtThirdDestinationcity).sendKeys(thirdDestination);


    }

    /*
    Validation city1 and city3
     */

    public static void validateDesigationandDeparture() {
        getDriver().findElement(txtThirdDestinationcity).click();
        getDriver().findElement(txtThirdDepartureCity).click();

        String designation_3 = getDriver().findElement(txtThirdDestinationcity).getAttribute("value");
        String departure_3 = getDriver().findElement(txtThirdDepartureCity).getAttribute("value");

        System.out.println("Get the default value from last designation Text field" + designation_3);
        System.out.println("Get the default value from last departure Text field" + departure_3);


        SoftAssert softassert = new SoftAssert();
        softassert.assertNotNull(designation_3 + "City 2 is not defaulted");
        softassert.assertNotNull(departure_3 + "City 1 is not defaulted");

        softassert.assertAll();


    }
    /*
    validate Paasenger count in last page
     */

    public static void validatePassengerAndClass() {
        String firstPage_Adult = getDriver().findElement(By.xpath("//*[@id=\"search-controls-adults-nudger\"]")).getAttribute("value");
        String firstPage_Children = getDriver().findElement(By.xpath("//*[@id=\"search-controls-adults-nudger\"]")).getAttribute("value");
        String lastpage_Adult = getDriver().findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/div/div[1]/div/div[1]/span[1]")).getAttribute("value");
        String lastpage_Children = getDriver().findElement(By.xpath("//*[@id=\"app-root\"]/div/div[2]/div/div[1]/div/div[1]/span[2]")).getAttribute("value");

        System.out.println("the number of passnegers in first page" + lastpage_Adult + firstPage_Children);
        System.out.println("the number of passnegers in last page" + firstPage_Adult + lastpage_Children);


        SoftAssert softassert = new SoftAssert();
        softassert.assertSame(firstPage_Children, lastpage_Children,"Both children number are same");
        softassert.assertSame(firstPage_Adult, lastpage_Adult,"Both are Adult number are  same");


    }


}







