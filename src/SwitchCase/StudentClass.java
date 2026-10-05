package SwitchCase;

import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        switch (name) {
            case "Fady":
                System.out.print("you are Hana's brother ");
                break;
            case "Amira":
                System.out.print("you are Hana's Mother ");
                break;
            case "Sara":
                System.out.print("you are Hana's Sister ");
                break;
            case "Salem":
                System.out.print("you are Hana's Father ");
                break;
            default:
                System.out.print("you are not member of Hana's family ");



        }
    }
}
