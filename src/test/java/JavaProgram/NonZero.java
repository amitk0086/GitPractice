package JavaProgram;

import java.util.Arrays;

public class NonZero {
    public static void main(String args[])
    {

        int arr[]= {10,0,0,3,4,6,0,0};
        int len=arr.length;
        //output 10,3,4,6,0,0,0,0

        int nz=0;
        int z=0;
        for (int i=0;i<len;i++)
        {
            if(arr[nz]!=0)
            {
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else
            {
               nz++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("My Name is Amit");



    }

}
