public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static double accountsTotal;
    private static int accountsCreated;

    //constructor

    public BankAccount(){
        accountsCreated++;
        checkingBalance = 0;
        savingsBalance = 0;
    }
    //getters and setters

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }
    public static int getAccountsCreated(){
        return accountsCreated;
    }
    public static double getAccountsTotal(){
        return accountsTotal;
    }
    //methods
    public void deposit(String account, double amount){
        if(account.equals("checking")){
            checkingBalance += amount;
        }else if(account.equals("savings")){
            savingsBalance += amount;
        }
        accountsTotal += amount;
    }
    public void withdraw(String account, double amount){
        if(account.equals("checking")){
            if(checkingBalance >= amount){
                checkingBalance -= amount;
                accountsTotal -= amount;
            }else{
                System.out.println("Insufficient funds!");
            }
        } else if (account.equals("savings")){
            if(savingsBalance >= amount){
                savingsBalance -=amount;
                accountsTotal -= amount;
            }else{
                System.out.println("Insufficient funds!");
            }
        }
    }
    public void displayAccount(){
        System.out.printf("Checkings: $ %.2f \nSavings: $ %.2f \n", checkingBalance, savingsBalance);
    }
}