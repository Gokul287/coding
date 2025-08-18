package Algorithms.Sorting_Algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        insertionSort(arr, n);
        System.out.println("Sorted array: Usong Insertion Sort");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[], int n)
    {
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }g
}
