import java.util.Scanner;

public class P24 {
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

        spiralMatrix(arr);
    }
    public static void spiralMatrix(int matrix[][])
    {
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;

        while(top<=bottom && left<=right)
        {
            for(int col =left;col<=right;col++)
            System.out.print(matrix[top][col] + "->");

            top++;

            for(int row=top;row<=bottom;row++)
            System.out.print(matrix[row][right] + "->");
            right--;

            if(top>bottom || left>right)
            break;

            for(int rcol=right;rcol>=left;rcol--)
            System.out.print(matrix[bottom][rcol] + "->");
          

            bottom--;

            for(int rrow=bottom;rrow>=top;rrow--)
            System.out.print(matrix[rrow][left] + "->");
            
            left++;
        }
    }
}
