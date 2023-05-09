package operatoriSiExpresii;

import java.util.Scanner;

public class Cumparaturi_3210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int s = input.nextInt();

        System.out.println(s/b + " " + (b-(s%b)));
    }
}
