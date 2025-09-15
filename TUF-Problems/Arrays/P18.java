import java.util.Scanner;
//Rearrange array in alternating positive and negative items with O(1) extra space (Leetcode : 2149)
public class P18 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array (must be EVEN length):");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (must be both positive and negative same times):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = new int[n];
        int pos =0;
        int neg =1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                ans[pos]=arr[i];
                pos+=2;
            }
            else
            {
                
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        System.out.println("The rearranged array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
// Example problem: arr[]={3,1,-2,-5,2,-4}
// The output for the example problem will be [3,-2,1,-5,2,-4] or any other valid arrangement
// Time Complexity: O(n)
// Space Complexity: O(n)
// where n is the number of elements in the array.  
// This approach uses two pointers to place positive and negative numbers at their respective positions in the result array.
// This approach works for arrays with equal number of positive and negative numbers.   
// If the input is invalid (not even length or not equal number of positive and negative), the behavior is not defined.
// Note: The problem assumes that the input array has an equal number of positive and negative integers and the length of the array is even.