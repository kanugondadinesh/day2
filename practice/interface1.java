public class interface1 {
    public static void main(String[] args) {
        UPI u=new UPI();
        u.pay();
    }
}
interface payment {
    void pay();

}
class UPI implements payment{

    @Override 
    public void pay(){
        System.out.println("payment done");

    }

}
