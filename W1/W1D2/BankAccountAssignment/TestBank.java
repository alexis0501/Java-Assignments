public class TestBank {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        System.out.println(BankAccount.getAccountsCreated());
        account1.deposit("checking",500);
        account1.deposit("savings",150);
        account1.withdraw("checking",300);
        account1.withdraw("savings",350);
        account1.displayAccount();
        System.out.println(BankAccount.getAccountsTotal());
    }
}