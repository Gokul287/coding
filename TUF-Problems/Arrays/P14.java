import java.util.HashMap;
import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int rem = target-arr[i];
            if(map.containsKey(rem))
            {
                System.out.println("Pair found: (" + map.get(rem) + ", " + i + ")");
                return;
            }
            else
            {
                map.put(arr[i], i);
            }
        }
        System.out.println("No pair found with the given target sum.");
    }
}
