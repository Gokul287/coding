import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// pascal's triangle (Leetcode : 118)
public class P26{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int n=sc.nextInt();

        List<List<Integer>> result =generatePascal(n);
        for(List<Integer> list : result)
        {
            System.out.println(list);
        }   

    }

    // generate pascal triangle
    public static List<List<Integer>> generatePascal(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            list=generateRow(i);

            result.add(list);
        }

        return result;
    }

    // generate a particular row of pascal triangle
    public static List<Integer> generateRow(int row)
    {
        List<Integer> list = new ArrayList<>();

        long ans = 1;

        list.add(1);

        for(int col =1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            list.add((int)ans);
        }

        return list;
    }

}