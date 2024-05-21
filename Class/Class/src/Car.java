public class Car {
    private String model;
    private int yom;
    private String body;
    private int price;
    private int mspeed;

    public Car(String model, int yom, String body, int price, int mspeed) {
        this.model = model;
        this.yom = yom;
        this.body = body;
        this.price = price;
        this.mspeed = mspeed;
    }

    public Car(String audiRs7, int yom, int i, String sedan) {
    }

    public void checkCar() {
        if (this.price > 15000) {
            System.out.println("This car is expensive");
        } else {
            System.out.println("This car is pretty cheap");
        }

        if (this.yom > 10) {
            System.out.println("This car is old");
        } else {
            System.out.println("This car is pretty young");
        }

    }
}