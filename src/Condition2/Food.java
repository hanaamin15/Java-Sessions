package Condition2;

import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        String food;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the food you would like to buy");
        food = input.nextLine();
        if (food.equals("pizza")) {
            System.out.println("your pizza will be ready in 15 minutes");
        }
        else if (food.equals("pasta"))
        {
            System.out.println("Pasta will be ready in 20 minutes");

        }
        else if  (food.equals("cheese"))
        {
            System.out.println("your cheese will be ready in 10 minutes");
        }
        else if  (food.equals("chicken"))
        {
            System.out.println("your chicken will be ready in 30 minutes");
        }


    }
}
