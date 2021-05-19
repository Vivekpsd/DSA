
import java.util.*;

public class displayArrRev {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        displayArrReverse(arr, n - 1);

        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx < 0) {
            return;
        }

        System.out.println(arr[idx]);
        displayArrReverse(arr, idx - 1);
    }

}