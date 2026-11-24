public class abstraction1 {
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
        b.start();
    
    }
}
abstract class vehicle {
    abstract void start();

    void run(){
        System.out.println("starting");
    }
}
class Bike extends vehicle {
    @Override
    void start(){
        System.out.println("starting");

    }
}
