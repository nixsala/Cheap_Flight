package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

public class TransportPage extends PageBase {

    /*
    Initialize Web element
     */
    private static By checkBoxDirect = By.xpath("//*[@id=\"stops_content\"]/div/div/div[1]/label/input");
    private static By checkBoxTwoStop = By.xpath("//*[@id=\"stops_content\"]/div/div/div[3]/label/input");
    private static By scollerDuabiToNewyork = By.xpath("//*[@id=\"departure-times_content\"]/div/div/div[1]/div/div[5]");
    private static By scollerNewToLos = By.xpath("//*[@id=\"departure-times_content\"]/div/div/div[2]/div/div[4]");
    private static By scollerLosTodubai = By.xpath("//*[@id=\"departure-times_content\"]/div/div/div[3]/div/div[5]");
    private static By scrollerTotalDuaration=By.xpath("//*[@id=\"duration_content\"]/div/div/div/div/div[3]");
    private static By comboboxSortBy=By.cssSelector("select[class='BpkSelect_bpk-select__3oqKC']");
    private  static By buttonSelect=By.xpath("//*[@id=\"app-root\"]/div[1]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/a/div/div[3]/div/button");


    /*
    Un tick Direct check Box
     */
    public static void clickOnDirectCheckbox() {
        WebElement chckDirect = getDriver().findElement(checkBoxDirect);
        boolean isSelected_1 = chckDirect.isSelected();
        if (isSelected_1 == true) {
            chckDirect.click();


        }
//        getDriver().findElement(checkBoxDirect).click();


    }



    /*
    Un tick Direct  2 plus check box
     */


    public static void clickOncheckBoxTwoStop() {
        WebElement chckTwoStop = getDriver().findElement(checkBoxTwoStop);
        boolean isSelected_2 = chckTwoStop.isSelected();
        if (isSelected_2 == true) {
            chckTwoStop.click();


        }
//        getDriver().findElement(checkBoxTwoStop).click();

    }

    /*
    Drag scroller Dubai to  Newyork
     */
    public static void scrollDuabiToNewyork() {


        Actions act = new Actions(getDriver());
        WebElement slider = getDriver().findElement(scollerDuabiToNewyork);
        act.dragAndDropBy(slider, -50, 0).build().perform();


    }

    /*
    Drag scroller Newyork to LosAngello

     */
    public static void scollToNewToLos() {


        Actions act = new Actions(getDriver());
        WebElement slider = getDriver().findElement(scollerNewToLos);
        act.dragAndDropBy(slider, 50, 0).build().perform();


    }

    /*
    Drag scroller Losangello to Dubai

     */
    public static void scollFromLosTodubai() {


        Actions act = new Actions(getDriver());
        WebElement slider = getDriver().findElement(scollerLosTodubai);
        act.dragAndDropBy(slider, -50, 0).build().perform();


    }


    /*
    Set Total for all flights

     */
    public static void setTotalDurationS() {


        Actions act = new Actions(getDriver());
        WebElement sliderTotal = getDriver().findElement(scrollerTotalDuaration);
        act.dragAndDropBy(sliderTotal, +50, 0).build().perform();


    }

    /*
    Select the cheapest fight from the combo box
     */
    public static void clickComboSortBy() {
        getDriver().findElement(comboboxSortBy).click();
        Select selectCheapest = new Select(getDriver().findElement(comboboxSortBy));
        selectCheapest.selectByIndex(1);


    }
    /*
    Click select button
     */
    public static void clickSelectButton() {
        getDriver().findElement(buttonSelect).click();


    }



}

