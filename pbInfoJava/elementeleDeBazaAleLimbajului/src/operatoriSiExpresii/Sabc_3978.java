package operatoriSiExpresii;

import java.util.Scanner;

public class Sabc_3978 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int s1 = 0, s2= 0, s3 = 0;
        int q = a;

        while (a <= b){

            s1+=a;
            a++;

        }
        a = q;


        while (a <= c){

            s3+=a;
            a++;
        }
        while (b <= c){

            s2+=b;
            b++;
        }
        System.out.println(s1 + " " + s2 + " " + s3);
    }
}
