import java.util.Scanner;

// Second largest element in an array

public class P2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>largest)
        {
            secondLargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondLargest && arr[i]!=largest)
        {
            secondLargest=arr[i];
        }
    }
    System.out.println("The second largest element in the array is: " + secondLargest);
}
}

// Time Complexity: O(n)
// Space Complexity: O(1)
// Where n is the number of elements in the array.
// Explanation: We traverse the array once to find the largest and second largest elements. We maintain two variables, largest and secondLargest, to keep track of these values. If we find a new largest element, we update secondLargest to be the old largest value. If we find an element that is greater than secondLargest but less than largest, we update secondLargest accordingly.

