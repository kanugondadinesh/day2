interface Alert {
    void sendAlert(String message);
}
class EmailAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}
class MobileAlert implements Alert {
    @Override
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}
public class Task26 {
    public static void main(String[] args) {
        Alert email = new EmailAlert();
        Alert mobile = new MobileAlert();
        email.sendAlert("Your account has been logged in.");
        mobile.sendAlert("OTP is 123456.");
    }
}