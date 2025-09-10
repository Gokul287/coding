
// Move Zeroes (Leetcode : 283)

import java.util.Scanner;

public class P6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l=0;
        for(int r=0;r<n;r++)
        {
            if(arr[r]!=0)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
            }
        }

        // Print the modified array
        System.out.println("The array after moving zeroes is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Two pointers approach
// Time Complexity: O(n)
// Space Complexity: O(1)
// Where n is the number of elements in the array.
// Explanation: We maintain two pointers, l and r. The r pointer iterates through the array, and whenever we find a non-zero element, we swap it with the element at the l pointer and increment l. This way, all non-zero elements are moved to the front of the array, and all zeroes are moved to the end.
// Note: The array is modified in place and the output prints the modified array.