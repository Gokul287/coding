import java.util.Scanner;
//Missing number in an array (Leetcode : 268)
public class P9 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
        }
        int missingNumber = totalSum - arrSum;
        System.out.println("The missing number is: " + missingNumber);

    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.
// This approach uses the formula for the sum of the first n natural numbers to find the missing number in the array.   
// It calculates the expected sum of numbers from 1 to n and subtracts the actual sum of the array elements to find the missing number.

