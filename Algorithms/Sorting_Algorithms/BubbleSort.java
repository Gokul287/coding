package Algorithms.Sorting_Algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array: Usong Bubble Sort");
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-i-1;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp= arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
