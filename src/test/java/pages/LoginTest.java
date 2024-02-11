package pages;

import TestCases.XLUtils;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginTest {
    public static void main(String args[]) throws IOException {
        FetchDate();
    }


    public void getdata()
    {

    }

        public static void FetchDate() throws IOException {
        String src="C:\\Users\\jkami\\OneDrive\\Desktop\\userdata.xlsx";
        FileInputStream fis = new FileInputStream(src);
            int totalrow =XLUtils.getRowNumber(src,"Sheet1");
            System.out.println(totalrow);
            int totalcolumn =XLUtils.getcolNumber(src,"Sheet1",1);
            System.out.print(totalcolumn);

            String loginData[][]= new String[totalrow][totalcolumn];

            for (int i=1;i<=totalrow;i++)
            {
                for(int j=0; j<totalcolumn;j++)
                {

                    loginData[i][j] =XLUtils.getcellvalue(src,"Sheet1",i,j);
                    System.out.print(loginData[i][j]+ " ");
                }
                System.out.println("");
            }

    }
}
