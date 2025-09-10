import java.util.Scanner;
// Find the number that appears once, and other numbers twice
public class P11 {
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<n; i++)
        {
            result = result ^ arr[i];
        }
        System.out.println("The number that appears once is: " + result);
    }
}
//Example:
// Input: arr = [4,1,2,1,2]
// Output: 4
// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.
// This approach uses the XOR bitwise operation to find the unique number in the array.
// The XOR of a number with itself is 0, and the XOR of a number with
// 0 is the number itself. Thus, all numbers that appear twice will cancel each other out, leaving only the unique number.

