
import java.util.*;

public class displayArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        displayArr(arr, n - 1);
    }

    public static void displayArr(int[] arr, int idx) {

        if (idx < 0) {
            return;
        }

        displayArr(arr, idx - 1);
        System.out.println(arr[idx]);

    }

}