import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = Arrays.stream(br.readLine().trim().split("\\s+"))
                              .mapToInt(Integer::parseInt)
                              .toArray();
            System.out.println(maxSubArraySum(arr));
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    private static int maxSubArraySum(int[] arr) {
        if (arr.length == 0) return 0;

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
