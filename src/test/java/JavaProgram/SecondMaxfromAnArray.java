package JavaProgram;

public class SecondMaxfromAnArray {

    public static void main(String args[])
    {
        int arr[]={1,3,2,6,7,7,9,9,5};
        int size=arr.length;
        int max=0;
        int secondmax=0;
        for (int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            if (arr[i]<max && arr[i]>secondmax)
            {
                secondmax=arr[i];
            }
        }

        System.out.print(secondmax);
        System.out.println("My Name is Kumar");
    }
}
