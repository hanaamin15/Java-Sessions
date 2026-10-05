package Combining;

import java.util.Scanner;

public class Combination {
    public  static void main(String[] args) {
       /*int age = 30;
        if (age > 10 && age > 20)
        {
            System.out.println("you are eligible to register");

        }
        else if (age < 10 || age < 20)
        {
            System.out.println("you are not eligible to register");
        }*/

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your age:");
        age = sc.nextInt();
        if(age > 18 || age > 20){
            System.out.println("you are eligible to register");
        }
        else if(age < 18 && age < 16){
            System.out.println("you are not eligible to register");
        }
        if(age!=18 && age!=20){
            System.out.println("you are too old to register");
        }

    }


}




