import java.util.Scanner;
// Maximum Consecutive Ones (Leetcode : 485)
public class P10 {
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == 1)
            {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else
            {
                count = 0;
            }
        }
        System.out.println("The maximum number of consecutive 1's is: " + maxCount);
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.  
// This approach uses a single pass through the array to count consecutive 1's and keeps track of the maximum count found so far.
// It resets the count whenever a 0 is encountered.
