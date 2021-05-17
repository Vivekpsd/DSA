import java.util.*;

//3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
public class NumPattern {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pzz(n);

        scn.close();

    }

    public static void pzz(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");

    }
}
