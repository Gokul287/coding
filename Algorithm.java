import java.util.*;
public class Algorithm{
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