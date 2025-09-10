import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int index = -1; // Default value if the element is not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break; // Exit the loop once the element is found
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
