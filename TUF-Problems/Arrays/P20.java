import java.util.ArrayList;
import java.util.Scanner;

public class P20 {
     public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                list.add(arr[i]);
                max =arr[i];
                
            }
        }
        swap(list,0,list.size()-1);
        for(int i: list)
        {
            System.out.print(i+" ");
        }
    }
    
    static void swap(ArrayList<Integer> list, int start, int end)
    {
        while(start < end)
        {
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start+=1;
            end-=1;
        }
    }
}
