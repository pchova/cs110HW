package hwAssignments;//Polina Chetnikova, CS110 Section C
//Program that lets you practice subtraction. Enter a min and max value and,
//you will receive 5 problems within that range to solve.
import java.util.Scanner;
import java.util.Random;
public class SubtractionTutor {
    public static void main(String[] args){
        //Define Variables
        int lowVal;
        int highVal;
        int num1;
        int num2;
        int userAnswer;
        int count = 0;
        int numCorrect = 0;
        Random rand;
        Scanner scan = new Scanner(System.in);

        //Display rules
        System.out.println("Welcome to the Subtraction Tutor");
        System.out.println("You will supply a low value and high value, " +
                " defining the range\nof values to be included in your quiz." +
                " You will get 5 problems.\nThe value must be positive and no" +
                " larger than 9999");
        //ask user for input
        System.out.print("Low value : ");
        lowVal = scan.nextInt();

        //input validation to make sure lowVal is greater than 1 and less than 9999
        while(lowVal < 1 || lowVal > 9999){
            System.out.print("Your low value must be greater than 1 " +
                    "and less than 9999. Low Value: ");
            lowVal = scan.nextInt();
        }

        //ask user for input
        System.out.print("High value : ");
        highVal = scan.nextInt();

        //input validation for highVal is between 1-9999 and greater than lowVal
        while(highVal <= lowVal || highVal > 9999){
            System.out.print("Your high value must be greater than your low value " +
                    "and less than 9999. High Value: ");
            highVal = scan.nextInt();
        }

        //generate 2 random num within range from userInput and make sure num2 is greater than num1
        //use a loop to create 5 subtraction problems and display them
        do{
            //generate random number
            rand = new Random();
            num1 = rand.nextInt((highVal-lowVal) + 1) + lowVal;
            num2 = rand.nextInt((highVal-lowVal) + 1) + lowVal;

            //generates another random number till num2 > num1
            if(!(num2>num1)){
                num2 = rand.nextInt((highVal-lowVal) + 1) + lowVal;
            }else{
                //display problem
                System.out.printf(" %5d\n-%5d\n -----\nAnswer? ", num2, num1);
                userAnswer = scan.nextInt();

                //display whether user got the problem right or wrong, and sets count
                if(userAnswer != (num2-num1)){
                    System.out.println("Incorrect! The answer is " + (num2-num1));
                }else{
                    System.out.println("Correct!");
                    numCorrect++;
                }
                //increment count
                count++;
            }
        }while(count < 5);

        //numCorrect set the count for how many problems the user got correct
        //display the results
        if(numCorrect == 5){
            System.out.println("\nThe quiz is over");
            System.out.println("Excellent! You got all " + numCorrect + " problems correct.");
        }else if(numCorrect >= 3){
            System.out.println("\nThe quiz is over");
            System.out.println("You got over half correct, practice makes perfect!");
        }else{
            System.out.println("\nThe quiz is over");
            System.out.println("You got less than half correct, you need to spend more time practicing.");
        }
    }
}
