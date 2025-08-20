import java.util.Scanner;
class MergeSort {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, n - 1);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
       if(left<right)
       {
        int mid =left+(right-left)/2;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr, left, mid, right);
       }
    }

    public static void merge(int arr[], int left, int mid, int right)
    {
        int n1= mid-left+1;
        int n2=right-mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i=0;i<n1;i++)  
        {
            arr1[i]=arr[left+i];
        }

        for(int j=0;j<n2;j++)
        {
            arr2[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=left;

        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }

    }
}
