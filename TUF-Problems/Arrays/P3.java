import java.util.Scanner;
// Array is sorted and rotated or not (Leetcode : 1752)

public class P3 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    boolean isSorted = true;
    int length = arr.length;
    int k=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>arr[(i+1)%length])
        {
           k+=1;
        }
        if(k>1)
        {
            isSorted=false;
            break;
        }
    }
    System.out.println("Is the array sorted in non-decreasing order? " + isSorted);
}
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Where n is the number of elements in the array.
// Explanation: We traverse the array once to check if it is sorted and rotated. We maintain a counter k to count the number of times an element is greater than the next element (considering the array as circular). If k exceeds 1, we can conclude that the array is not sorted and rotated.
// If k is 0 or 1, the array is sorted and rotated.