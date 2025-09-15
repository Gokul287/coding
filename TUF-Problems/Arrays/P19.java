import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        System.out.println("The next permutation is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void nextPermutation(int[] nums) {
       int length = nums.length;

       int index=-1;

       for(int i=length-2;i>=0;i--)
       {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
       } 
       if(index == -1)
       {
        rev(nums,0,length-1);
        return;
       }

       for(int i=length-1;i>index;i--)
       {
            if(nums[i] > nums[index])
            {
                swap(nums,i,index);
                break;
            }
       }

       rev(nums,index+1,length-1);

    }

    public  static void rev(int arr[],int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;

            start+=1;
            end-=1;
        }
    }

    public  static void swap(int arr[] , int start, int end)
    {
         int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;
    }
}
