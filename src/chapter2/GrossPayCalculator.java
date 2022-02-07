package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
//        1. Get the number of hours worked, prompt user, and get input as a number
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);

        //storing info in that variable as an int data type, var declaration
        int hours = scanner.nextInt();


//        2. Get the hourly pay rate, prompt user and get input as a decimal number
        System.out.println("Enter the employee's pay rate");

        //declaring variable, double data type
        double rate = scanner.nextDouble();
        scanner.close();

//        3. Multiply hours and pay rate
        double grossPay = hours * rate;

//        4. Display result
        System.out.println("The employee's gross pay is: " + grossPay);
    }

}
