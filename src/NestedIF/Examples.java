package NestedIF;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        String name;
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        System.out.println("Please enter your grade:");
        grade = sc.nextInt();
        if (name.equalsIgnoreCase("John")) {
            if (grade >= 90) {
                System.out.println("you are passed the exam");
            }
            else {
                System.out.println("you are not passed the exam");
            }

        }


        else {
        System.out.println("you are not passed the exam");
    }

    } }
