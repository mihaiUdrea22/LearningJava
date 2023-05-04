package controlFlow_3;

import java.util.Scanner;

public class DecisionIf {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();
        System.out.println(inputtedNum);

        if(inputtedNum < 5){
            System.out.println("Enjoy the good luck");
        } else {
            System.out.println("the number it is less than 5");
        }


    }

}
