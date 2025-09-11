import java.util.HashMap;
import java.util.Scanner;
// Find the maximum length of a subarray with sum equal to target (positive and negative numbers)
public class P13 {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum == target)
            {
                max = Math.max(max, i+1);
            }

            int rem =sum-target;
            if(map.containsKey(rem))
            {
                int len= i-map.get(rem);
                max = Math.max(max, len);
            }

            if(!map.containsKey(sum))
            {
                map.put(sum, i);
            }
        }
        System.err.println("The maximum length of subarray with sum equal to target is: " + max);
    }
}
//Example:
// Input: arr = [10,5,2,7,-1,2], target = 7
// Output: 4 (subarray [5,2,7,-1])  
// Time Complexity: O(n)
// Space Complexity: O(n)
// where n is the number of elements in the array.
// This approach uses a HashMap to store the cumulative sums and their corresponding indices.
// As we iterate through the array, we calculate the cumulative sum and check if there exists a previous cumulative sum
// such that the difference between the current cumulative sum and the previous cumulative sum equals the target.
// If such a previous cumulative sum exists, it means that the subarray between the two indices has a sum equal to the target.
// We update the maximum length of such subarrays found during the iteration.
// This approach works for arrays with both positive and negative numbers.