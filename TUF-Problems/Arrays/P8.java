import java.util.Scanner;
public class P8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array1:");  
        int n = sc.nextInt();
        int[] arr1 = new int[n]; 
        System.out.println("Enter the elements of the array1:");
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array2:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the array2:");
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }     
        union(arr1, arr2);
    }
    public static void union(int arr1[], int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int[] unionArray = new int[n1 + n2];
        int k = 0;
        int i=0;
        int j=0;

        while(i<n1 && j<n2)
        {
            if(arr1[i]<=arr2[j])
            {
                if(k == 0 || unionArray[k-1] != arr1[i])
                {
                    unionArray[k++]=arr1[i];
                }
                i++;
            }
            else
            {
                if(k == 0 || unionArray[k-1] != arr2[j])
                {
                    unionArray[k++]=arr2[j];
                }
                j+=1;
            }
        }

        while(i<n1)
        {
         
            if(k == 0 || unionArray[k-1] != arr1[i])
                {
                    unionArray[k++]=arr1[i];
                }
                i++;
        }

        while(j<n2)
        {
            if(k == 0 || unionArray[k-1] != arr2[j])
                {
                    unionArray[k++]=arr2[j];
                }
                j+=1;
        }

        System.out.println("The union of the two arrays is:");
        for(int r=0;r<k;r++)
        {
            System.out.print(unionArray[r]+" ");
        }
    }
}