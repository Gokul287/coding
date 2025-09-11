import java.util.Scanner;
// Find the maximum length of a subarray with sum equal to target (positive numbers only)
public class P12 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();


        int max=Integer.MIN_VALUE;
        int sum=0;
        int left =0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(sum>target && left<=right)
            {
                sum-=arr[left];
                left++;
            }
            if(sum == target)
            {
                max = Math.max(max, right-left+1);
            }
        }
        System.err.println("The maximum length of subarray with sum equal to target is: " + max);
    }
    
}


//Example:
// Input: arr = [1,2,3,7,5], target = 12
// Output: 2 (subarray [5,7])
// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.
// This approach uses the sliding window technique to find the maximum length of a subarray with sum
// equal to the target. It maintains a window defined by two pointers (left and right) and adjusts the window size
// based on the current sum compared to the target.
// The window is expanded by moving the right pointer and contracted by moving the left pointer when the sum exceeds the target.
// This approach works only for arrays with positive numbers.