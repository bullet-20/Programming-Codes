/* to calculate simple interest based on user input: */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = scan.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();
        
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        
        double interest = principal * rate * years / 100;
        
        System.out.println("The simple interest is: " + interest);
    }
}
