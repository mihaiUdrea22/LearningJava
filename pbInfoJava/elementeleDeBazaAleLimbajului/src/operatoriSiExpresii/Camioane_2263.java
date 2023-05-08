package operatoriSiExpresii;

import java.util.Scanner;

public class Camioane_2263 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();
        int z = input.nextInt();
        System.out.println((t1*n + t2*m) * z);
    }
}
