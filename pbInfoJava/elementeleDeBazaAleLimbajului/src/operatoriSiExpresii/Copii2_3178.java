package operatoriSiExpresii;

import java.util.Scanner;

public class Copii2_3178 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fete = input.nextInt();
        int baieti = input.nextInt();
        int paginiCititePeZi = input.nextInt();

        System.out.println(fete*3*paginiCititePeZi + baieti*2*paginiCititePeZi);
    }
}
