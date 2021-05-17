import java.util.*;

public class PowerLog {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = power(x, n);
        System.out.print(ans);

        scn.close();
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int pox = power(x, n / 2);
        int ans = pox * pox;

        if (n % 2 != 0) {
            ans = ans * x;
        }

        return ans;
    }

}
