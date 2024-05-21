public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shop myShop = new Shop("Audi Center", 1680512, 100000000, "Cars");
        myShop.displayInfo();
        Car myCar = new Car("AUDI RS7", 2022, 100000, "Sedan");
        myCar.checkCar();
        Customer customer = new Customer("John Doe", 35, "Software Engineer", 5000.0, 95000.0);
        customer.displayCustomerInfo();
        boolean canAfford = customer.canAffordCar(100000.0);
        System.out.println("Can the customer afford a car that costs $100,000? " + canAfford);
    }
}