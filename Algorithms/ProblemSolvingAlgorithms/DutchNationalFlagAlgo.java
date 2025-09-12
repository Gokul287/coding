import java.util.Scanner;
// Sort an array of 0's, 1's and 2's (Dutch National Flag Algorithm)
public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (only 0,1,2):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left=0,mid=0,right=n-1;

       while(mid<n)
       {
        if(arr[mid] == 0 && left<=mid)
        {
            int temp=arr[mid];
            arr[mid] =arr[left];
            arr[left]=temp;
            left+=1;
            mid+=1;
        }
        else if(arr[mid] ==2 && right>=mid){
            int temp=arr[mid];
            arr[mid]=arr[right];
            arr[right]=temp;
            right-=1;
        }
        else{
            mid+=1;
        }
       }


         System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Example:
// Input: arr = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Time Complexity: O(n)
// Space Complexity: O(1)
// where n is the number of elements in the array.
// This approach uses three pointers (left, mid, right) to partition the array into three
// sections: 0's, 1's, and 2's. The left pointer tracks the position to place the next 0,
// the mid pointer traverses the array, and the right pointer tracks the position to place the
// next 2. By swapping elements as needed, we can sort the array in a single pass.
// This approach is known as the Dutch National Flag Algorithm. 