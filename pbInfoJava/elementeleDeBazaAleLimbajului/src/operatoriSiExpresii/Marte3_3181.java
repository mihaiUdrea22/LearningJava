package operatoriSiExpresii;

import java.util.Scanner;

public class Marte3_3181 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int n = input.nextInt();
        int years = n/(x*y);
        int days = (n%(x*y))/y;
        int hrs = (n%(x*y))%y;
        System.out.println(years);
        System.out.println(days);
        System.out.println(hrs);

    }
}
