import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 4Sum Problem (leetcode 18)
public class P29 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        System.out.println("The  unique quadruplets are: "+ fourSum(arr,target));
        
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int len =nums.length;
        for(int i=0;i<len;i++)
        {
            if(i!=0 && nums[i] == nums[i-1])
            {
                continue;
            }

            for(int j=i+1;j<len;j++)
            {
                if(j>i+1 && nums[j] == nums[j-1])
                {
                    continue;
                }

                int k=j+1;
                int l=len-1;

                while(k<l)
                {
                    long  sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];

                    if(sum == target)
                    {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);

                        result.add(temp);
                        k+=1;
                        l-=1;
                        while(k<l && nums[k] == nums[k-1])
                        {
                            k+=1;
                        }

                        while(k<l && nums[l] == nums[l+1])
                        {
                            l-=1;
                        }
                    }
                    else if(sum > target)
                    {
                        l-=1;
                    }
                    else{
                        k+=1;
                    }
                }
            }
        }
        return result;
    }
}
