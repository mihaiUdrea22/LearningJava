package operatoriSiExpresii;

import java.util.Scanner;

public class Marte_3180 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int n = input.nextInt();
        int m = input.nextInt();
        int p = input.nextInt();

        System.out.println(n*a + m*b + p*c);
    }
}
