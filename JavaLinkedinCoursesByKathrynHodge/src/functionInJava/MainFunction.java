package functionInJava;


import java.util.Scanner;

public class MainFunction {

    public static void announceDeveloperTeaTime(){

        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a roandom word to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");

    }
    public static void main(String[] args) {

        announceDeveloperTeaTime();



    }
}
