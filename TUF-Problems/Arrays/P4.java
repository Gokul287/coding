import java.util.Scanner;

// Remove Duplicates from Sorted Array(Inplace) (leetcode : 26)
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int i=1,j=1;
        while(j<arr.length)
        {
            if(arr[i-1]!=arr[j])
            {
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        System.out.println("The array after removing duplicates is:");
        for(int k=0;k<i;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}

// Two pointers approach
// Time Complexity: O(n)
// Space Complexity: O(1)   
// Where n is the number of elements in the array.
// Explanation: We use two pointers, i and j. Pointer i keeps track of the position to insert the next unique element, while pointer j traverses the array. Whenever we find a new unique element (arr[j] != arr[i-1]), we insert it at position i and increment i. Finally, the first i elements of the array will be the unique elements.
// Note: The array is modified in place and the first i elements are the unique elements. The rest of the array may contain duplicates, but they are not considered part of the result.
// The length of the array after removing duplicates is i.
// The output prints the array up to the i-th index to show the unique elements.