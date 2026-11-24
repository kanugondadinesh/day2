
public class Task22 {
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount();
        sa.balance=50000;
        sa.displayAccountType();
        System.out.println(sa.calculateInterest());
    }
}
abstract class BankAccount{
    abstract double calculateInterest();
    void displayAccountType() {
        System.out.println("Bank Account Details");
    }
}
class SavingsAccount extends BankAccount{
    double balance;
    double calculateInterest(){
        return balance*0.05;

    }
}