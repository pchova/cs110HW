package hwAssignments;//Polina Chetnikova CS110 Section C
//A program that opens a file of integers and produces an output file of a table with numbers from input file
import java.io.*;
import java.util.Scanner;
public class NumberTester {
    public static void main(String[] args)throws IOException{
        //variables
        String filename, line, outFilename;
        int strToInt;
        int linenumber= 0;

        //open up a file for reading
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name: ");
        filename = scan.nextLine();
        Scanner readFile = new Scanner(new File(filename));

        //create an output file to write the data to
        //format the file w/ header
        outFilename = "results_" + filename;
        PrintWriter outFile = new PrintWriter(outFilename);
        outFile.printf("%8s%8s\n", " ", "Repeat");
        outFile.printf("%8s%8s%8s%8s\n", "Number", "Digits", "Even", "Prime");

        //write each line to the output file and loop through the file to read each line
        while(readFile.hasNext()){
            line = readFile.nextLine();
            //change str to int to access the methods
            strToInt = Integer.parseInt(line);
            String numRepeat;
            String numEven;
            String numPrime;
            //print + or - based on if the methods return true or false
            if(isRepeatedDigits(strToInt)==true){
                numRepeat = "+";
            }else{
                numRepeat = "-";
            }
            if(isEven(strToInt)==true){
                numEven = "+";
            }else{
                numEven = "-";
            }
            if(isPrime(strToInt)==true){
                numPrime = "+";
            }else{
                numPrime = "-";
            }
            //print each number and its properties to the file
            outFile.printf("%6s%8s%8s%8s\n", line, numRepeat, numEven, numPrime);
            linenumber++;
        }
        //close the file
        readFile.close();
        outFile.close();
    }

/** Method isPrime() takes an integer parameter and returns boolean value
 *  Returns true if the int is prime, false otherwise
 * @param n the integer to be tested
 * @return if n is prime return true, false otherwise
 */
    public static boolean isPrime(int n){
        //method takes an integer value
        int count = 2;
        //if remainder of n / count == 0 its not prime
        if (n % count == 0){
            return false;
        }else{
            //loop from 2 to (n-1) and if any number fits evenly, then return false
            while(n > count){
                if (n % count == 0){
                    return false;
                }
                //increment counter
                count++;
            }
        }
        //returns true if number is not even
        return true;
    }
/** Method isEven() takes an integer value and returns true is the number is prime, false otherwise
 * @param n the integer to be tested
 * @return if n is prime return true, false otherwise
 */
    public static boolean isEven(int n){
        //method takes an integer value
        int evenNum = 2;
        if(n % evenNum == 0){
            return true;
        }else{
            return false;
        }
    }
/** Method isRepeatedDigits() takes an integer value and returns true if the number contains
 * the same digit in adjacent locations in the number, false otherwise
 * @param n the integer to be tested
 * @return if n is prime return true, false otherwise
 */
    public static boolean isRepeatedDigits(int n){
        //method takes integer value and turns it into string
        String str = Integer.toString(n);
        int len = str.length();
        //create a for loop for i
        //create a for loop for i+1, then use to compare the string indexes
        for(int i = 0; i < len; i++){
            for(int p = i+1; p < len; p++){
                //if equal, return true
                if(str.charAt(i) == str.charAt(p)){
                    return true;
                }
                else{i++;}
            }
        }
        //false, if it exits the entire loop
        return false;
    }
}
