package hwAssignments;

//Polina Chetnikova CS110 Section C
//Savings Account class that stores a savings account's annual interest rate and balance
public class SavingsAccount {
    //instance fields
    private double balance;
    private double interestRate;
    private double lastInterest;

    /** Constructor that passes in two values for balance and interest rate
     * @param balance the savings account balance
     * @param interestRate the account interest rate
     */
    public SavingsAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    /** Void method that withdraws money amount from the savings account
     * @param subMoney The amount to withdraw from account balance
     */
    public void withdraw(double subMoney){

        balance -= subMoney;
    }

    /** Void method takes deposits money to the savings account
     * @param addMoney The amount to withdraw from account balance
     */
    public void deposit(double addMoney){

        balance += addMoney;
    }

    /** Void method that adds monthly interest to the savings
     *  account balance
     */
    public void addInterest(){

        balance += lastInterest;
    }

    /** Method that gets a copy of the bank account balance
     * @return balance
     */
    public double getBalance(){

        return balance;
    }

    /** Method that gets the interest rate
     * @return balance
     */
    public double getInterestRate(){

        return interestRate;
    }

    /** Method that gets the last interest rate
     */
    public double getLastInterest(){
        int annual = 12;
        int cto = 100;
        double monthlyRate = (interestRate / (double)annual);
        lastInterest = (monthlyRate/cto) * balance;
        return lastInterest;
    }
}
