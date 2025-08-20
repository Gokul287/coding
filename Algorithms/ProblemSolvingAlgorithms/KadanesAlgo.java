import java.util.Scanner;
public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = kadanesAlgorithm(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    // This method implements Kadane's Algorithm to find the maximum sum of a contiguous subarray
    // Example problem: arr[]={-2,1,-3,4,-1,2,1,-5,4}
    // The output for the example problem will be 6 (sum of subarray [4,-1,2,1])
    // If the input is invalid, it will return -1 and print "Invalid input"
    public static int kadanesAlgorithm(int arr[])
    {
        if(arr.length==0)
        {
            System.out.println("Invalid input");
            return -1;
        }

        int current=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            current+=arr[i];
           
            if(current>maxSum)
            {
                maxSum=current;
            }
            if(current<0)
            {
                current=0;
            }
        }
        return maxSum;
    }
}
