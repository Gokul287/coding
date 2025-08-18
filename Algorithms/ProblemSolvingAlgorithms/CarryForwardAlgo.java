// package Algorithms.ProblemSolvingAlgorithms.CarryForwardAlgo;

import java.util.Scanner;

public class CarryForwardAlgo {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char arr[] = new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        int count =carryForwardtechnique(arr,n);
        System.out.println(count);
    }

    // This function implements the carry forward technique 
    // Example problem arr[]={a,b,c,a,g,k,a,g,g} 
    // i<j && arr[i]=='a' && arr[j]=='g' return the count of pairs (i,j) such that i<j and arr[i]=='a' and arr[j]=='g'
    // The output for the example problem will be 8
    public static int carryForwardtechnique(char arr[], int n)
    {
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='a')
            {
                x+=1;
            }
            else if(arr[i]=='g')
            {
                y+=x;
            }
        }
        return y;
    }
}
