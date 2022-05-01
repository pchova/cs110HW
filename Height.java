package hwAssignments;//Polina Chetnikova CS110 Section C
//Program that calculates the user's height from inches.
import java.util.Scanner;
public class Height {
    public static void main(String[] args){
        //variables
        final int FOOT = 12;
        String name;
        int height;
        int feet;
        int inches;
        Scanner scan = new Scanner(System.in);

        //get user input
        System.out.print("Your name? ");
        name = scan.nextLine();
        System.out.print("How tall are you in inches? ");
        height = scan.nextInt();

        //height calculations
        feet = height / FOOT;
        inches = height % FOOT;

        //display info
        System.out.printf("%s is %d feet, %d inches\n", name, feet, inches);
    }
}
