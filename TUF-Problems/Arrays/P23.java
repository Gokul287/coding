import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows in matrix:");
        int n = sc.nextInt();   
        System.out.println("Enter the number of Columns in matrix:");
        int m = sc.nextInt(); 
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements of the matrix :");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        rotate90Degree(arr,n,m);
        System.out.println("Matrix after rotating 90 degree:");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotate90Degree(int arr[][], int n, int m)
    {
        // Transpose of matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i=0;i<n;i++)
        {
            int low=0, high=m-1;
            while(low<high)
            {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;

                low++;
                high--;
            }
        }
    }
}
