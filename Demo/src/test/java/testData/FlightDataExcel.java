package testData;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class FlightDataExcel extends ExcelDataConfig {

    public FlightDataExcel() {
        super("src/test/java/excelSheet/FlightCity.xlsx");
    }

    @DataProvider(name = "Flightcity")
    public Object[][] FlightcityDetails() {

        int rows = getRowCount("Sheet1");
        int col = getColumnCount("Sheet1");


        Reporter.log("row = " + rows + " columns = " + col);
        System.out.println("row = " + rows + " columns = " + col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet1", i, j);
            }
        }
        return data;
    }

}

