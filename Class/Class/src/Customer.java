public class Customer {
    private String name;
    private int age;
    private String profession;
    private double salary;
    private double budget;

    public Customer(String name, int age, String profession, double salary, double budget) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.salary = salary;
        this.budget = budget;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfession() {
        return this.profession;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getBudget() {
        return this.budget;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer name: " + this.name);
        System.out.println("Customer age: " + this.age);
        System.out.println("Customer profession: " + this.profession);
        System.out.println("Customer salary: " + this.salary);
        System.out.println("Customer budget: " + this.budget);
    }

    public boolean canAffordCar(double carPrice) {
        return this.budget + this.salary >= carPrice;
    }
}
