package controlFlow_3;

import java.util.Scanner;

public class ChallengeMultipleChoice {

    public static void main(String[] args) {

        String question = "What is speed of light in KM?";
        String choiceOne = "100.000 km/s";
        String choiceTwo = "300.000 km/s";
        String choiceThree = "250.000 km/s";

        System.out.println(question);
        System.out.println("Choose one answer from below:");
        System.out.println("a: " + choiceOne);
        System.out.println("b: " + choiceTwo);
        System.out.println("c: " + choiceThree);

        Scanner userInp = new Scanner(System.in);
        boolean answerIsWrong = true;
        while (answerIsWrong) {
            String userInput = userInp.next();

            if (userInput.equals("b")) {
                System.out.println("Your answer is right. Speed of light has: " + choiceTwo + ". Congrats!");
                answerIsWrong = false;
            } else {
                System.out.println("Yout answer is wrong. Choose again");
            }
        }

    }




}
