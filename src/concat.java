/**
 * Created by Yuliya on 23.12.2014.
 */

import java.util.Scanner;

public class concat {

    public static void main(String[] args) {
        int i;

        System.out.println("Введите длину первого массива");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        System.out.println("Введите длину второго массива");
        int n2 = scan.nextInt();

        int[] x = new int[n1];
        int[] y = new int[n2];

        for (i = 0; i < n1; i++) {
            x[i] = i + 2;
        }

        for (i = 0; i < n2; i++) {
            y[i] = i + 5;
        }

        int n = n1 + n2;
        int[] z = concat.conc(x, y, n);

        for (i = 0; i < n; i++) {
            System.out.println(z[i]);
        }

    }

    public static int[] conc(int[] x, int[] y, int n) {

        int[] concat = new int[n];

        System.arraycopy(x, 0, concat, 0, x.length);
        System.arraycopy(y, 0, concat, x.length, y.length);

        return concat;
    }

}
