import java.util.Arrays;
import java.util.Scanner;

public class Median {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read n
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];

        // TODO: Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // TODO: Sort the array (Use Arrays.sort())
        Arrays.sort(arr);

        // TODO: Find the middle element (index n/2)
        // Since n is guaranteed to be odd, n/2 gives the exact center index
        int middleIndex = n / 2;

        // TODO: Print the median
        System.out.println(arr[middleIndex]);
        
        sc.close();
    }
}