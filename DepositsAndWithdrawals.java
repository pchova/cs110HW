package hwAssignments;//Polina Chetnikova CS110 Section C
//hwAssignments.Driver class that takes in deposits and withdraws from 2 files
// and calculates the interest rate using methods from the hwAssignments.SavingsAccount class
import java.io.*;
import java.util.Scanner;
public class DepositsAndWithdrawals {
    public static void main(String[] args) throws IOException{
        //instance variables
        double balance = 500.00;
        double interest;
        String depositFile = "deposits.txt";
        String withdrawFile = "withdraws.txt";

        //ask user for interest rate and save in var
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the savings account\'s annual interest rate: ");
        interest = scan.nextDouble();

        //create savingsAccount object, print starting balance
        SavingsAccount savings = new SavingsAccount(balance, interest);
        System.out.printf("Starting Balance: $%.2f\n", savings.getBalance());

        //open the deposits.txt file for reading and loop through each line
        Scanner readFile = new Scanner(new File(depositFile));
        //deposit each value to the balance and print it
        while(readFile.hasNextDouble()){
            double d = readFile.nextDouble();
            savings.deposit(d);
            System.out.printf("Deposit: $%.2f, balance = $%.2f\n", d, savings.getBalance());
        }
        //close the deposits.txt file
        readFile.close();

        //open the withdraws.txt file for reading and loop through each line
        Scanner readF2 = new Scanner(new File(withdrawFile));
        //withdraw each value from the balance and print it
        while(readF2.hasNextDouble()){
            double w = readF2.nextDouble();
            savings.withdraw(w);
            System.out.printf("Withdraw: $%.2f, balance = $%.2f\n", w, savings.getBalance());
        }
        //close the withdraws.txt file
        readF2.close();

        //print the interest earned, add the monthly interest to the total and print the balance
        System.out.printf("Interest Earned: $%.2f\n", savings.getLastInterest());
        savings.addInterest();
        System.out.printf("Ending Balance: $%.2f\n", savings.getBalance());

    }
}
