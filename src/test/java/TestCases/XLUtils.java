package TestCases;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class XLUtils {
    public static FileInputStream fis;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow rows;
    public static XSSFCell cell;

    public static int getRowNumber(String filename, String sheetname) throws IOException {
        fis= new FileInputStream(filename);
        workbook= new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetname);
        int row = sheet.getLastRowNum();

        workbook.close();
        fis.close();

        return row;
    }

    public static int getcolNumber(String filename, String sheetname, int row) throws IOException
    {
        fis= new FileInputStream(filename);
        workbook= new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetname);
        rows= sheet.getRow(row);
        int col= rows.getLastCellNum();
        workbook.close();
        fis.close();
        return col;
    }

    public static String getcellvalue(String filename, String sheetname, int row, int colm) throws IOException
    {
        fis= new FileInputStream(filename);
        workbook= new XSSFWorkbook(fis);
        sheet = workbook.getSheet(sheetname);
        rows= sheet.getRow(row);
        cell= rows.getCell(colm);
        String data;
        try {
            DataFormatter formatter = new DataFormatter();
            String cellData =formatter.formatCellValue(cell);
            return cellData;

        }catch(Exception e)
        {
           data="";
        }
        workbook.close();
        fis.close();
        return data;
    }
}
