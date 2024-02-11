package JavaProgram;

public class MissingNumber {
    public static void main(String args[]) {


    int arr[] = {1, 2, 3, 4, 6, 7, 8, 9};
    int max=0;
        int sum = 0;
        int missingnum = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

        for(int i = 1;i<=max;i++)
        {
         missingnum=missingnum+i;
        }


    for(int i = 0;i<arr.length;i++)
    {
       sum=sum+arr[i];
    }
    System.out.println(sum);
        missingnum=missingnum-sum;
        System.out.println(missingnum);

        System.out.println("My Name is Khan");
  }



}
