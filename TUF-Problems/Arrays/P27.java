
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// majority element II (n/3 times) (Leetcode : 229)
public class P27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {   
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority elements are : " + majorityElement(arr));
    }

     public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        int el1=0,el2=0,count1=0,count2=0;

        for(int i=0;i<length;i++)
        {
            if(count1 ==0 && nums[i]!=el2)
            {
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1)
            {
                count2=1;
                el2=nums[i];
            }
            else if(el1 == nums[i])
            {
                count1+=1;
            }
            else if(el2 == nums[i])
            {
                count2+=1;
            }
            else{
                count1-=1;
                count2-=1;
            }

        }
        count1=0;
        count2=0;
        for(int i=0;i<length;i++)
        {
            if(el1 == nums[i])
            {
                count1+=1;
            }
            else if(el2 == nums[i])
            {
                count2+=1;
            }
        }

        int mini = length/3;
        if(count1> mini)
        {
            list.add(el1);
        }
        if(count2 >mini)
        {
            list.add(el2);
        }

        return list;
    }
}
