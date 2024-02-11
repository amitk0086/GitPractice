package JavaProgram;

public class BuyShellShare {
    public static void main(String args[]) {

        int arr[] = {1, 3, 5, 2, 7, 2, 8, 9, 4};
        int minbuy = arr[0];
        int maxprofit = 0;
        for (int i = 0; i < arr.length;i++)
        {
            maxprofit=Math.max(maxprofit,arr[i]-minbuy);
            minbuy =Math.min(minbuy,arr[i]);
        }

        System.out.print(maxprofit);
    }
}
