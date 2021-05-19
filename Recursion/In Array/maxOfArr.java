
import java.util.*;

public class maxOfArr {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int mx = maxOfArray(arr, 0);
        System.out.print(mx);

        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int mosa = maxOfArray(arr, idx + 1);
        int mx = Math.max(mosa, arr[idx]);
        return (mx);
    }

}