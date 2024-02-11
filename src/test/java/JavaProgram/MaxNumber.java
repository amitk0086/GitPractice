package JavaProgram;

public class MaxNumber {
    public static void main(String args[])
    {
        int arr[] ={2,4,5,3,4,2,5,6,9};
       int max=0;
       for (int i=0;i<arr.length;i++)
       {
           if(arr[i]>max)
           {
               max=arr[i];
           }
       }
       System.out.print(max);
    }

}
