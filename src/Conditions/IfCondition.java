package Conditions;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        int salary ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your salary");
        salary = input.nextInt();
        if (salary <= 5000)
        {
            System.out.println("there is 50% annual raise");
        }
        else if  (salary > 5000)
        {
            System.out.println("there is 20% annual raise");
        }
        else if  (salary > 8000)
        {
            System.out.println("there is 10% annual raise");
        }
    }
}
