import java.util.HashMap;
import java.util.Scanner;
// SubArray sum equals K (Leetcode 560)
public class P25 {
     public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        System.out.println("The number of subarrays with sum equal to k is:");
        System.out.print(count(arr, k));
    }

    public static int count(int arr[], int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

       int prefixSum=0;
       int count=0;

       map.put(0,1);

       for(int num:arr)
       {
        prefixSum+=num;

        if(map.containsKey(prefixSum-k))
        {
            count+=map.get(prefixSum-k);
        }

        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
       }

       return count;
    }
}
