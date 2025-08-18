import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        // Example usage of the SlidingWindow class
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max =slidingWindow(arr,k);
        System.out.println(max);
        System.out.println("Sliding Window Algorithm Example");
    }

    // Add methods for sliding window algorithm here
    // This method implements a sliding window algorithm to find the maximum sum of a subarray of size k
    // Example problem: arr[]={1,2,3,4,5,6} and k=3
    // The output for the example problem will be 15 (sum of subarray [4,5,6])
    // If the input is invalid, it will return -1 and print "Invalid input"
    public static int slidingWindow(int[] arr, int k) {
        // Example implementation of a sliding window algorithm
       if(arr.length==0 || k<=0 || k>arr.length)
       {
        System.out.println("Invalid input");
        return -1;
       }

       int maxSum=0,windowSum=0;
       for(int i=0;i<k;i++)
       {
        windowSum += arr[i];
       }
       maxSum = windowSum;

       for(int i=k;i<arr.length;i++)
       {
        windowSum += arr[i]-arr[i-k];
        maxSum=Math.max(maxSum, windowSum);
       }
       return maxSum;
    }
    
}
