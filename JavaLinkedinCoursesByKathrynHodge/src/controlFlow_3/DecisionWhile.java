package controlFlow_3;

import java.util.Scanner;

public class DecisionWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){

            System.out.println("playing current song");
            System.out.println("Would you like to take this song off repeat? if so, answer yes");
            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
            System.out.println("Playing next song");
        }
    }
}
