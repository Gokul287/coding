import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// longest increasing subsequence in an array (Leetcode 128)
public class P21 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int maxLength = 1;
        int currentLength = 0;

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for(int it :set){
            if(!set.contains(it-1))
            {
                int x=it;
                currentLength=1;
                while(set.contains(x+1))
                {
                    x+=1;
                    currentLength+=1;
                }
                maxLength = Math.max(maxLength,currentLength);
            }
        }
        System.out.println(maxLength);
    }
}
