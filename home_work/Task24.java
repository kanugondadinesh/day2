abstract class Delivery {
    void acceptOrder() {
        System.out.println("Delivery order accepted");
    } 
    abstract void deliverProduct();
}
class FoodDelivery extends Delivery {
    @Override
    void deliverProduct() {
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery {
    @Override
    void deliverProduct() {
        System.out.println("Parcel delivered successfully");
    }
}
public class Task24 {
    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();
        ParcelDelivery pd = new ParcelDelivery();
        fd.acceptOrder();
        fd.deliverProduct();
        pd.acceptOrder();
        pd.deliverProduct();
    }
}