import java.util.*;
class BubbleSort{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] =  new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        BubbleSort(arr, n);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSort(int arr[],int n)
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