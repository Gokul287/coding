public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = calculatePrefixSum(arr);
        
        System.out.print("Prefix Sum Array: ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }

    // This method calculates the prefix sum of an array.
    // The prefix sum at index i is the sum of all elements from index 0 to
    public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }
}
