import java.util.Scanner;

public class P22 {
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

        setZero(arr,n,m);
        System.out.println("Matrix after setting zeros:");
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void setZero(int arr[][], int n, int m)
    {
        int col0=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == 0)
                {
                    arr[i][0]=0; // for row
                    if(j!=0)
                    {
                        arr[0][j]=0; // for column
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(arr[i][0]==0 || arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }

        if(arr[0][0] == 0)
        {
            for(int j=0;j<m;j++)
            {
                arr[0][j]=0;
            }
        }

        if(col0 == 0)
        {
            for(int i=0;i<n;i++)
            {
                arr[i][0]=0;
            }
        }
    }
}
