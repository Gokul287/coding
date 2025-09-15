import java.util.Scanner;
//maximum subarray sum (Kadane's Algorithm) (Leetcode : 53)
public class P17 {
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
// Example problem: arr[]={-2,1,-3,4,-1,2,1,-5,4}
// The output for the example problem will be 6 (sum of subarray [4,-1,2,1])
// If the input is invalid, it will return -1 and print "Invalid input"
// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.
// This approach uses a single pass through the array, maintaining a running sum of the current sub
// array and updating the maximum sum found so far. If the running sum becomes negative, it is reset to zero,
// as a negative sum would only decrease the sum of any subsequent subarray. This ensures that we always
// consider only positive contributions to the subarray sum.
// This approach works for arrays with both positive and negative numbers.


