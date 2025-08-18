package Algorithms.Sorting_Algorithms;
import java.util.*;
class SelectionSort{
    public static void main(String a[])
    {
    Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr, n);
        System.out.println("Sorted array: Usong Selection Sort");
        System.out.println(Arrays.toString(arr));

    }

    public static void SelectionSort(int arr[],int n)
    {
        boolean swapped = false;
        for(int i=0;i<n;i++)
        {    
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                    swapped =true;
                }
            }

            if(swapped)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapped = false;
            }

        }
    }
}