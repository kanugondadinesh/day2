public class Task23 {
    public static void main(String[] args) {
        UPIPayment up=new UPIPayment();
    up.showAmount();
    up.processPayment();
    }
}
class Payment{
    double amount;
    Payment(double amount){
        this.amount=amount;
    }
    void showAmount(){
        System.out.println("Payment Amount: ₹" + amount);
    }
}
class  UPIPayment extends Payment{
    UPIPayment(){
        super(1000);
    }

    void processPayment(){
        System.out.println("Payment processed successfully using UPI");
    }
}