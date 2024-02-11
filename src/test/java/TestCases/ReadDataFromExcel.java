package TestCases;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public static void main(String args[]) throws IOException {
        File src= new File("C:\\Users\\jkami\\OneDrive\\Desktop\\userdata.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        int row=sheet.getLastRowNum();
        int col= sheet.getRow(1).getLastCellNum();

        for(int i=1;i<=row;i++)
        {
            XSSFRow rows= sheet.getRow(i);
            for(int j=0;j<col;j++)
            {
                String str= rows.getCell(j).toString();
                System.out.print(str);
            }
            System.out.println();
        }



    }

}
