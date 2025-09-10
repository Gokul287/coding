import java.util.Scanner;

//Largest element in an array

public class P1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int max = arr[0];   
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("The maximum value in the array is: " + max);
    }
}
// Time Complexity: O(n) where n is the number of elements in the array.
// Space Complexity: O(1) as we are using a constant amount of extra space.
// Problem Statement: Find the maximum value in an array of integers.
// Input: An array of integers.
// Output: The maximum integer value in the array.
// Example:
// Input: [3, 5, 7, 2, 8]   
// Output: 8
// Explanation: The program iterates through the array to find the maximum value by comparing each element with the current maximum.