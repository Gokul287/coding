import java.util.Scanner;

// Left Rotate Array (Leetcode: 189)
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of rotations: ");

        int k = sc.nextInt();

        k = k % n; // In case k is greater than n

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("The array after rotation is:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
//Two pointers approach
// Time Complexity: O(n)
// Space Complexity: O(1)
// Where n is the number of elements in the array.
// Explanation: We first reverse the entire array. Then we reverse the first k elements and finally reverse the remaining n-k elements. This effectively rotates the array to the right by k steps.
// Note: The array is modified in place and the output prints the rotated array.
// If k is greater than n, we take k modulo n to avoid unnecessary rotations.
// For example, if n=5 and k=7, rotating the array by 7 steps is equivalent to rotating it by 2 steps (7 % 5 = 2).
// If k is 0, the array remains unchanged.
