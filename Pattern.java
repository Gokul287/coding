
import java.util.*;

// TAKE U FORWARD PATTERN PRINTING SHEET AND MORE
// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        characterReversePyramidPattern(n);
        System.out.println("Pattern Printing");
    }

    // This method prints a SQUARE PATTERN of stars
    // public static void squarePattern(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // RIGHT ANGLE TRIANGLE PATTERN
    // public static void trianglePattern(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // TRIANGLE NUMBER PATTERN 1
    //  public static void trianglePattern1(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(i+1+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // TRIANGLE NUMBER PATTERN 2
    //  public static void trianglePattern2(int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(j+1+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // INVERTED TRIANGLE PATTERN 
    //  public static void invertedTrianglePattern(int n)
    // {
    //     for(int i=n;i>0;i--)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // INVERTED TRIANGLE NUMBER PATTERN 1
    //  public static void invertedTrianglePattern1(int n)
    // {
    //     for(int i=n;i>0;i--)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print(j+1+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // INVERTED TRIANGLE NUMBER PATTERN 2
    //  public static void invertedTrianglePattern2(int n)
    // {
    //     for(int i=n;i>0;i--)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // PYRAMID PATTERN
    //  public static void pyramidPattern(int n)
    // {
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int s=0;s<n-i;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<(2*i)-1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // INVERTED PYRAMID PATTERN
    //  public static void invertedPyramidPattern(int n)
    // {
    //     for(int i=n;i>0;i--)
    //     {
    //         for(int s=0;s<n-i;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<(2*i)-1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // DIAMOND PATTERN
    // public static void diamondPattern(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int s = 0; s < n - i; s++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 0; j < (2 * i) - 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for (int i = n; i > 0; i--) {
    //         for (int s = 0; s < n - i; s++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 0; j < (2 * i) - 1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //################################################


    // HALF DIAMOND PATTERN

    //  public static void halfDiamondPattern(int n)
    // {
    //     int t=n;
    //     for(int i=0;i<n*2;i++)
    //     {
    //        if(i<n)
    //        {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //        }
    //        else{
    //             t-=1;
    //             for(int j=t;j>0;j--)
    //             {
    //                 System.out.print("*");
    //             }
    //        }
    //         System.out.println();
    //     }
    // }


    //################################################


    // TUF 11TH PATTERN 0 AND 1 PATTERN

    // public static void zeroOnePattern(int n)
    // {
    //     int c=1;
    //     for(int i=0;i<n;i++)
    //     {
    //         c=(i%2==0)?1:0;
    //         for(int j=0;j<i+1;j++)
    //         {
    //            System.out.print(c+" ");
    //            c=(c==1)?0:1;
    //         }
    //         System.out.println();
    //     }
    // }


     //################################################

     // TUF 12TH PROBLEM (V GAP PATTERN)

    //  public static void vGapPattern(int n)
    //  {
    //     int g=2;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(j+1);
    //         }

    //         for(int s=0;s<(n*2)-g;s++)
    //         {
    //             System.out.print(" ");
    //         }
    //         g+=2;

    //         for(int j=i+1;j>0;j--)
    //         {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //  }


     //################################################


    // TRIANGLE NUMBER PATTERN 3 (TUF 13TH PROBLEM)
    //  public static void trianglePattern3(int n)
    // {
    //     int c=1;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(c++ +" ");
    //         }
    //         System.out.println();
    //     }
    // }


     //################################################


    // TRIANGLE CHARACTER PATTERN (TUF 14TH PROBLEM)
    //  public static void triangleCharacterPattern(int n)
    // {
    //     char c='A';
    //     for(int i=0;i<n;i++)
    //     {
    //         c='A';
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(c++ +" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // INVERTED TRIANGLE CHARACTER PATTERN (TUF 15TH PROBLEM)
    //  public static void invertedTriangleCharacterPattern(int n)
    // {
    //     char c='A';
    //     for(int i=n;i>0;i--)
    //     {
    //         c='A';
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(c++ +" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //################################################


    // TRIANGLE CHARACTER PATTERN2 (TUF 16TH PROBLEM)
    //  public static void triangleCharacterPattern2(int n)
    // {
    //     char c='A';
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<i+1;j++)
    //         {
    //             System.out.print(c +" ");
    //         }
    //         c+=1;
    //         System.out.println();
    //     }
    // }


    //################################################


    //  CHARACTER REVERSE PYRAMID PATTERN (TUF 17TH PROBLEM)
    //  public static void characterReversePyramidPattern(int n)
    // {
    //     char c='A';
    //     int v=0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int s=0;s<n-i;s++)
    //         {
    //             System.out.print(" ");
    //         }

    //         for(int j=1;j<=(i*2)-1;j++)
    //         {
    //             if(j<=i)
    //             {
    //                 c=(char)('A'+ j-1);
    //             }
    //             else{
    //                 c=(char)('A'+ i*2-j-1);
    //             }
    //             System.out.print(c);
    //         }
            
    //         System.out.println();
    //     }
            
        
    // }

}
