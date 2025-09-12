import java.util.Scanner;

public class MooresVotingAlgo {
//Majority Element (Moore's Voting Algorithm (also called the Boyer-Moore Majority Vote Algorithm)) (Leetcode : 169)
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element =0,count=0;

        for(int i=0;i<n;i++)
        {
            if(count == 0)
            {
                count =1;
                element = arr[i];
            }
            else if(arr[i] == element){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        int c =0;
       for(int i:arr)
       {
        if(i == element)
        {
            c+=1;
        }
       }
       if(c>n/2)
       {
        System.out.print("Majority element in an Array is: "+" "+element);
       }
       else{
        System.out.println("Majority element does not exist");
       }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)
//where n is the number of elements in the array.
//This approach uses the Moore's Voting Algorithm to find the majority element in the array.
//The algorithm maintains a count and a candidate element. It iterates through the array, updating 
//the count and candidate based on the current element. If the count reaches zero, it selects a new candidate.
//After determining a candidate, it verifies if the candidate is indeed the majority element by counting its
//occurrences in the array. If the count of the candidate exceeds n/2, it is confirmed as the majority element.
//This approach works for arrays with both positive and negative numbers.

