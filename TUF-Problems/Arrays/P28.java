import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 3Sum Problem 
public class P28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.err.println("The unique triplets are: "+threeSum(arr));
        
    }
    public static  List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length-1;

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length && nums[i]<=0;i++)
        {
            if(i !=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            
            int j=i+1;
            int k=len;

            while(j<k)
            {
                int sum =nums[i]+nums[j]+nums[k];

                if(sum > 0)
                {
                    k--;
                }
                else if( sum <0 )
                {
                    j++;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    result.add(temp);
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1])
                    {
                        j++;
                    }

                    while(j<k && nums[k] == nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }

        return result;
    }
}
// Time Complexity: O(NlogN)+O(N2), where N = size of the array.
// Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2). 

// Space Complexity: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).